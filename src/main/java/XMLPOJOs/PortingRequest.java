package XMLPOJOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "portingrequest")
public class PortingRequest {

    PortingRequestV2 v2;

    public PortingRequest() {}

    public PortingRequestV2 getV2() {
        return v2;
    }

    public void setV2(PortingRequestV2 v2) {
        this.v2 = v2;
    }
}
