package Components;

import POJOs.*;
import POJOs.CustomerInfo;
import XMLPOJOs.CustomerInfoXML;
import XMLPOJOs.Message;
import XMLPOJOs.PortingRequestV2;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Component
public class PrepForPostAndPost {
    private Client client;
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
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://mbygpk4ss2.execute-api.us-east-1.amazonaws.com/test/number-portability/v1/dossiers").path("portingrequest");

        //CustomerInfoSetters
        CustomerInfo customerInfo = CustomerInfoCreator(unmarshalledXMLmessage);

        //PortingRequestSetters
        PortingRequest portingRequest = PortingRequestCreator(customerInfo, unmarshalledXMLmessage);

        //body setters
        PortingRequestBody body = PortingRequestBodyCreator(portingRequest);

        //message setters
        PortingRequestMessage message = PortingRequestMessageCreator(body);

        //PortingrequestEnvelope setters
        PortEnv portEnv = PortEnvCreator(message);

        //InvocationBuilder
        Invocation.Builder invb = InvocationBuilderCreator(webTarget);

        //Postrequest
        PortenvelopePost(portEnv, invb);

    }

    public List<String> XMLdataToString(Message message) {
        CustomerInfoXML customerInfoXML = new CustomerInfoXML();
        String xmlLastname = message.getBody().getPortingrequest().getV2().getCustomerinfo().getLastname();
        String xmlCompanyname = message.getBody().getPortingrequest().getV2().getCustomerinfo().getCompanyname();
        String xmlHousenr = message.getBody().getPortingrequest().getV2().getCustomerinfo().getHousenr();
        String xmlHousenrext = message.getBody().getPortingrequest().getV2().getCustomerinfo().getGetHousenrext();
        String xmlPostcode = message.getBody().getPortingrequest().getV2().getCustomerinfo().getPostcode();
        String xmlCustomerid = message.getBody().getPortingrequest().getV2().getCustomerinfo().getCustomerid();
        List<String> xmlCustomerdata = new ArrayList<String>();
        xmlCustomerdata.add(xmlLastname);
        xmlCustomerdata.add(xmlCompanyname);
        xmlCustomerdata.add(xmlHousenr);
        xmlCustomerdata.add(xmlHousenrext);
        xmlCustomerdata.add(xmlPostcode);
        xmlCustomerdata.add(xmlCustomerid);
        for (int x = 0; x < xmlCustomerdata.size(); x++) {
            System.out.println(xmlCustomerdata.get(x));
        }
        return xmlCustomerdata;

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

    public PortingRequestBody PortingRequestBodyCreator(PortingRequest portingRequest) {
        PortingRequestBody body = new PortingRequestBody();
        body.setPortingRequest(portingRequest);
        return body;
    }

    private PortingRequestMessage PortingRequestMessageCreator(PortingRequestBody body) {
        PortingRequestMessage message = new PortingRequestMessage();
        message.setBody(body);
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

    public CustomerInfo CustomerInfoCreator(Message message) {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setLastname(message.getBody().getPortingrequest().getV2().getCustomerinfo().getLastname());
        customerInfo.setCompanyname(message.getBody().getPortingrequest().getV2().getCustomerinfo().getCompanyname());
        customerInfo.setHousenr(message.getBody().getPortingrequest().getV2().getCustomerinfo().getHousenr());
        customerInfo.setHousenrext(message.getBody().getPortingrequest().getV2().getCustomerinfo().getGetHousenrext());
        customerInfo.setPostcode(message.getBody().getPortingrequest().getV2().getCustomerinfo().getPostcode());
        customerInfo.setCustomerid(message.getBody().getPortingrequest().getV2().getCustomerinfo().getCustomerid());
        return customerInfo;
    }
}



