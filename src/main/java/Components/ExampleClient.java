package Components;

import POJOs.*;
import POJOs.CustomerInfo;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
public class ExampleClient {
    private Client client;
    private WebTarget webTarget;

    public ExampleClient() {
    }

    public ExampleClient(Client client, WebTarget webTarget) {
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

    public void Classbuilder() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://mbygpk4ss2.execute-api.us-east-1.amazonaws.com/test/number-portability/v1/dossiers").path("portingrequest");

        //CustomerInfoSetters
        CustomerInfo customerInfo = CustomerInfoCreator();

        //PortingRequestSetters
        PortingRequest portingRequest = PortingRequestCreator(customerInfo);

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

    public PortingRequest PortingRequestCreator(CustomerInfo customerInfo) {
        PortingRequest portingRequest = new PortingRequest();
        portingRequest.setDossierId("15235453");
        portingRequest.setRecipientserviceprovider("BBB");
        portingRequest.setRecipientnetworkoperator("BBB");
        portingRequest.setDonornetworkoperator("AAA");
        portingRequest.setDonorserviceprovider("AAA");
        portingRequest.setCustomerInfo(customerInfo);
        portingRequest.setNotes("dit zijn notities");
        return portingRequest;
    }

    public CustomerInfo CustomerInfoCreator() {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setLastname("Bergrit Haards van Duinen");
        customerInfo.setCompanyname("Ben");
        customerInfo.setHousenr("69");
        customerInfo.setHousenrext("b");
        customerInfo.setPostcode("6441GS");
        customerInfo.setCustomerid("445412456");
        return customerInfo;
    }
}



