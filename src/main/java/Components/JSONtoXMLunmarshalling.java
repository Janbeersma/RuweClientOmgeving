package Components;

import POJOs.PortEnv;
import POJOs.PortingRequestMessage;
import POJOs.TestClass;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.sound.sampled.Port;
import java.io.*;

public class JSONtoXMLunmarshalling {
    public JSONtoXMLunmarshalling() {}

    public void marshallIntoClass() throws FileNotFoundException {
        Jsonb jsonb = JsonbBuilder.create();
        PortingRequestMessage message = jsonb.fromJson(new FileReader("C:\\Users\\Florian.Romijn\\Desktop\\spring-boot\\spring-boot\\src\\main\\resources\\static\\jsonmessage.json"), PortingRequestMessage.class);
        System.out.println(message.getBody().getPortingRequest().getRepeats().getSeq());
    }
}
