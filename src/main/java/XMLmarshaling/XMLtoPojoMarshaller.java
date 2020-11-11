/*
package XMLmarshaling;

import XMLannoPOJOs.XMLmessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLtoPojoMarshaller {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Florian.Romijn\\Desktop\\demo\\RuweClientOmgeving\\src\\main\\java\\XMLmarshaling\\message.xml");

        try {
            JAXBContext ctx = JAXBContext.newInstance(XMLmessage.class);
            Unmarshaller jaxbUnmarshaller = ctx.createUnmarshaller();
            XMLmessage xmLmessage = (XMLmessage) jaxbUnmarshaller.unmarshal(file);

            System.out.println(xmLmessage.getBody().getPortingrequestmessage());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}*/
