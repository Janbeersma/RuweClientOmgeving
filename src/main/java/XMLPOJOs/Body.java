
package XMLPOJOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "body")
public class Body {
    String nestTest;
    PortingRequest portingrequest;

    public Body() {}

    public String getNestTest() {
        return nestTest;
    }

    public void setNestTest(String nestTest) {
        this.nestTest = nestTest;
    }

    public PortingRequest getPortingrequest() {
        return portingrequest;
    }

    public void setPortingrequest(PortingRequest portingrequest) {
        this.portingrequest = portingrequest;
    }
}

