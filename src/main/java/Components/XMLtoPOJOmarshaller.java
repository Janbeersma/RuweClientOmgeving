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

    public void marshalintoClass() throws JAXBException, FileNotFoundException {
        File xmlMessage = new File("C:\\Users\\Florian.Romijn\\Desktop\\spring-boot\\spring-boot\\src\\main\\resources\\static\\message.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Message.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        message = (Message) unmarshaller.unmarshal(xmlMessage);
        System.out.println(message);
    }
}