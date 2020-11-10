/*
package RestClient;

//import POJOs.Message;
import POJOs.*;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class jsonmaakclass {

    public static void main(String[] args) {

        //CustomerInfoSetters
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setLastname("Hendriksen");
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

        Jsonb jsonb = JsonbBuilder.create();

        String result = jsonb.toJson(portEnv);
        System.out.println(result);
    }
}
*/
