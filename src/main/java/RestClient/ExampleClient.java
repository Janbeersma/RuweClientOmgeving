package RestClient;

import POJOs.*;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ExampleClient {

    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://mbygpk4ss2.execute-api.us-east-1.amazonaws.com/test/number-portability/v1/dossiers").path("portingrequest");

        //CustomerInfoSetters
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setLastname("Bergrit Haards van Duinen");
        customerInfo.setCompanyname("Ben");
        customerInfo.setHousenr("69");
        customerInfo.setHousenrext("b");
        customerInfo.setCustomerid("445412456");

        //PortingRequestSetters
        PortingRequest portingRequest = new PortingRequest();
        portingRequest.setDossierId("15235453");
        portingRequest.setRecipientserviceprovider("BBB");
        portingRequest.setRecipientnetworkoperator("BBB");
        portingRequest.setDonornetworkoperator("AAA");
        portingRequest.setDonorserviceprovider("AAA");
        portingRequest.setCustomerInfo(customerInfo);
        portingRequest.setNotes("dit zijn notities");
        //portingRequest.setRepeats();

        //body setters
        PortingRequestBody body = new PortingRequestBody();
        body.setPortingRequest(portingRequest);

        PortingRequestMessage message = new PortingRequestMessage();
        message.setBody(body);

        PortEnv portEnv = new PortEnv(15,"portforwarding", message);


        Invocation.Builder invb = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invb.post(Entity.entity(portEnv, MediaType.APPLICATION_JSON_TYPE));
    }
}



