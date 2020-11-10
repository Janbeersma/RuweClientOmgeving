package XMLannoPOJOs;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLbody {

    @XmlElement(name = "portingrequestmessage")
    public String portingrequestmessage;

    public XMLbody() {}

    public XMLbody(String portingrequestmessage) {
        this.portingrequestmessage = portingrequestmessage;
    }

    public String getPortingrequestmessage() {
        return portingrequestmessage;
    }

    public void setPortingrequestmessage(String portingrequestmessage) {
        this.portingrequestmessage = portingrequestmessage;
    }
}
