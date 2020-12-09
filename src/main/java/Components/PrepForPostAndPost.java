package Components;

import POJOs.*;
import POJOs.CustomerInfo;
import XMLPOJOs.Message;
import XMLPOJOs.PortingRequestSequenceV2;
import XMLPOJOs.PortingRequestV2;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
public class PrepForPostAndPost {
    private static Client client;
    private WebTarget webTarget;

    public PrepForPostAndPost() {
    }

    public PrepForPostAndPost(Client client, WebTarget webTarget) {
        this.client = client;
        this.webTarget = webTarget;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public WebTarget getWebTarget() {
        return webTarget;
    }

    public void setWebTarget(WebTarget webTarget) {
        this.webTarget = webTarget;
    }

    public void PrepAndPost(Message unmarshalledXMLmessage) {
        Client client = getClientInstance();
        WebTarget webTarget = client.target("https://mbygpk4ss2.execute-api.us-east-1.amazonaws.com/test/number-portability/v1/dossiers").path("portingrequest");

        //CustomerInfoSetters
        CustomerInfo customerInfo = CustomerInfoCreator(unmarshalledXMLmessage);

        //PortingRequestRepeats setters
//        PortingRequest.Repeats repeats = PortingRequestRepeatsCreator(unmarshalledXMLmessage);

        //EnumProfileSequence
        EnumProfileSequence enumProfileSequence = EnumProfileSequenceCreator(unmarshalledXMLmessage);

        //PortingRequestSetters
        PortingRequest portingRequest = PortingRequestCreator(customerInfo, unmarshalledXMLmessage);

        //body setters
        PortingRequestBody body = PortingRequestBodyCreator(portingRequest);

        //Receiverdata overzetten naar JSON geannoteerde class
        PortingRequestReceiver receiver = ReceiverCreator(unmarshalledXMLmessage);

        //Senderdata overzetten naar JSON geannoteerde class
        PortingRequestSender sender = SenderCreator(unmarshalledXMLmessage);

        //Headerdata overzetten naar JSON geannoteerde class
        PortingRequestHeader header = PortingRequestHeaderCreator(unmarshalledXMLmessage, receiver, sender);

        //message setters
        PortingRequestMessage message = PortingRequestMessageCreator(body, header);

        //PortingrequestEnvelope setters
        PortEnv portEnv = PortEnvCreator(message);

        //InvocationBuilder
        Invocation.Builder invb = InvocationBuilderCreator(webTarget);

        //Postrequest
        PortenvelopePost(portEnv, invb);

    }

    //Singleton voor de client
    public static Client getClientInstance() {
        if (client == null) {
            client = ClientBuilder.newClient();
        }
        return client;
    }

    private void PortenvelopePost(PortEnv portEnv, Invocation.Builder invb) {
        Response response = invb.post(Entity.entity(portEnv, MediaType.APPLICATION_JSON_TYPE));
    }

    public Invocation.Builder InvocationBuilderCreator(WebTarget webTarget) {
        Invocation.Builder invb = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
        return invb;
    }

    public PortEnv PortEnvCreator(PortingRequestMessage message) {
        PortEnv portEnv = new PortEnv("15", "portforwarding", message);
        return portEnv;
    }

    public PortingRequestReceiver ReceiverCreator(Message message) {
        PortingRequestReceiver receiver = new PortingRequestReceiver();
        receiver.setNetworkoperator(message.getHeader().getReceiver().getNetworkoperator());
        receiver.setServiceprovider(message.getHeader().getReceiver().getServiceprovider());
        return receiver;
    }

    public PortingRequestSender SenderCreator(Message message) {
        PortingRequestSender sender = new PortingRequestSender();
        sender.setNetworkoperator(message.getHeader().getSender().getNetworkoperator());
        sender.setServiceprovider(message.getHeader().getSender().getServiceprovider());
        return sender;
    }

    public PortingRequestHeader PortingRequestHeaderCreator(Message message, PortingRequestReceiver receiver, PortingRequestSender sender) {
        PortingRequestHeader header = new PortingRequestHeader();
        header.setReceiver(receiver);
        header.setSender(sender);
        header.setTimestamp(message.getHeader().getTimestamp());
        return header;
    }

    public PortingRequestBody PortingRequestBodyCreator(PortingRequest portingRequest) {
        PortingRequestBody body = new PortingRequestBody();
        body.setPortingRequest(portingRequest);
        return body;
    }

    private PortingRequestMessage PortingRequestMessageCreator(PortingRequestBody body, PortingRequestHeader header) {
        PortingRequestMessage message = new PortingRequestMessage();
        message.setBody(body);
        message.setHeader(header);
        return message;
    }

    public PortingRequest PortingRequestCreator(CustomerInfo customerInfo, Message message) {
        PortingRequest portingRequest = new PortingRequest();
        PortingRequestV2 v2 = new PortingRequestV2();
        portingRequest.setDossierId(message.getBody().getPortingrequest().getV2().getDossierid());
        portingRequest.setRecipientserviceprovider(message.getBody().getPortingrequest().getV2().getRecipientserviceprovider());
        portingRequest.setRecipientnetworkoperator(message.getBody().getPortingrequest().getV2().getRecipientnetworkoperator());
        portingRequest.setDonornetworkoperator(message.getBody().getPortingrequest().getV2().getDonornetworkoperator());
        portingRequest.setDonorserviceprovider(message.getBody().getPortingrequest().getV2().getDonorserviceprovider());
        portingRequest.setCustomerInfo(customerInfo);
        portingRequest.setNotes(v2.getNote());
        return portingRequest;
    }

//    public PortingRequest.Repeats PortingRequestRepeatsCreator(Message message) {
//        PortingRequest.Repeats repeats = new PortingRequest.Repeats();
//    }

    public EnumProfileSequence EnumProfileSequenceCreator(Message message) {
        EnumProfileSequence enumProfileSequence = new EnumProfileSequence();
        List<PortingRequestSequenceV2> portseqList = message.getBody().getPortingrequest().getV2().getRepeats().getSeq();
        PortingRequestSequenceV2 portseqv2 = portseqList.get(0);
        List<XMLPOJOs.EnumProfileSequence> enumseqlist = portseqv2.getRepeats().getSeq();
        XMLPOJOs.EnumProfileSequence enumseq = enumseqlist.get(0);
        enumProfileSequence.setProfileid(enumseq.getProfileid());
        return enumProfileSequence;
    }

    public CustomerInfo CustomerInfoCreator(Message message) {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setLastname(message.getBody().getPortingrequest().getV2().getCustomerinfo().getLastname());
        customerInfo.setCompanyname(message.getBody().getPortingrequest().getV2().getCustomerinfo().getCompanyname());
        customerInfo.setHousenr(message.getBody().getPortingrequest().getV2().getCustomerinfo().getHousenr());
        customerInfo.setHousenrext(message.getBody().getPortingrequest().getV2().getCustomerinfo().getHousenrext());
        customerInfo.setPostcode(message.getBody().getPortingrequest().getV2().getCustomerinfo().getPostcode());
        customerInfo.setCustomerid(message.getBody().getPortingrequest().getV2().getCustomerinfo().getCustomerid());
        return customerInfo;
    }
}



