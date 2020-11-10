package XMLannoPOJOs;
import javax.xml.bind.annotation.*;
import java.util.UUID;

@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLmessage {

    @XmlAttribute(name = "id")
    public UUID id;

    @XmlElement(name = "body")
    public XMLbody body;

    public XMLmessage() {}

    public XMLmessage(UUID id, XMLbody body) {
        this.id = id;
        this.body = body;
    }

    public UUID getId() {

        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public XMLbody getBody() {
        return body;
    }

    public void setBody(XMLbody body) {
        this.body = body;
    }
}
