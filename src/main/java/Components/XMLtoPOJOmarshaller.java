package Components;

import XMLPOJOs.Message;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

@Component
public class XMLtoPOJOmarshaller {
    Message message;

    public XMLtoPOJOmarshaller() {}

    public XMLtoPOJOmarshaller(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message marshalintoClass() throws JAXBException, FileNotFoundException {
        File xmlMessage = new File("C:\\Users\\Florian.Romijn\\Desktop\\spring-boot\\spring-boot\\src\\main\\resources\\static\\message.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Message.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        message = (Message) unmarshaller.unmarshal(xmlMessage);
        return message;
        //System.out.println(message.getId());
        //System.out.println(message.getTest());
        //System.out.println(message.getBody().getNestTest());
        //System.out.println(message.getBody().getPortingrequest().getV2().getDossierid());
        //System.out.println(message.getBody().getPortingrequest().getV2().getCustomerinfo().getCompanyname());
    }
}
