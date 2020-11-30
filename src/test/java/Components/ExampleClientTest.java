package Components;

import POJOs.CustomerInfo;
import POJOs.PortingRequest;
import POJOs.PortingRequestBody;
import POJOs.PortingRequestMessage;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
/*
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExampleClientTest {
    @Test
    void ShouldReturnCorrectCustomerInfo() throws Exception {
        ExampleClient testClient = new ExampleClient();
        //testen van de id
        var customerinfo = testClient.CustomerInfoCreator();
        var testid = "445412456";
        assertThat(customerinfo.customerid.equals(testid));

        //testen van postcode
        var testpostcode = "6441GS";
        assertThat(customerinfo.postcode.equals(testpostcode));

        //testen van huisnummer extensie
        var testhousenrext = "b";
        assertThat(customerinfo.housenrext.equals(testhousenrext));

        //testen van huisnummer
        var testhousenr = "69";
        assertThat(customerinfo.housenr.equals(testhousenr));

        //testen van bedrijfsnaam
        var testcompanyname = "Ben";
        assertThat(customerinfo.equals(testcompanyname));

        //testen van achternaam
        var testlastname = "Bergrit Haards van Duinen";
        assertThat(customerinfo.lastname.equals(testlastname));
    }

    @Test
    void ShouldReturnCorrectPortingRequest() throws Exception {
        ExampleClient testclient = new ExampleClient();
        CustomerInfo customerInfo = testclient.CustomerInfoCreator();
        var portingrequest = testclient.PortingRequestCreator(customerInfo);

        //testen van dossierid
        var testdossierid = "15235453";
        assertThat(portingrequest.dossierId.equals(testdossierid));

        //testen van recipientserviceprovider
        var testrecipientserviceprovider = "BBB";
        assertThat(portingrequest.recipientserviceprovider.equals(testrecipientserviceprovider));

        //testen van recipientnetworkoperator
        var testrecipientnetworkoperator = "BBB";
        assertThat(portingrequest.recipientnetworkoperator.equals(testrecipientnetworkoperator));

        //testen van donornetworkoperator
        var testdonornetworkoperator = "AAA";
        assertThat(portingrequest.donornetworkoperator.equals(testdonornetworkoperator));

        //testen van donorserviceprovider
        var testdonorserviceprovider = "AAA";

        //testen van notes
        var testnotes = "dit zijn notities";
        assertThat(portingrequest.notes.equals(testnotes));

        //testen van customerinfo
        assertThat(portingrequest.customerInfo.equals(customerInfo));
    }

    @Test
    void ShouldReturnCorrectPortingRequestBody() throws Exception {
        ExampleClient testclient = new ExampleClient();
        CustomerInfo customerInfo = testclient.CustomerInfoCreator();
        PortingRequest portingRequest = testclient.PortingRequestCreator(customerInfo);
        PortingRequestBody portingRequestBody = testclient.PortingRequestBodyCreator(portingRequest);

        assertThat(portingRequestBody.portingRequest.equals(portingRequest));
    }

    @Test
    void ShouldReturnCorrectPortEnv() throws Exception {
        ExampleClient testclient = new ExampleClient();
        CustomerInfo customerInfo = testclient.CustomerInfoCreator();
        PortingRequest portingRequest = testclient.PortingRequestCreator(customerInfo);
        PortingRequestBody portingRequestBody = testclient.PortingRequestBodyCreator(portingRequest);
        PortingRequestMessage portingRequestMessage = new PortingRequestMessage();
        var portenv = testclient.PortEnvCreator(portingRequestMessage);

        //testid
        var testid = "15";
        assertThat(portenv.id.equals(testid));

        //test portingname
        var testportingname = "portforwarding";
        assertThat(portenv.portingName.equals(testportingname));

        assertThat(portenv.message.equals(portingRequestMessage));
    }
}
 */