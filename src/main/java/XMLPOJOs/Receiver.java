package XMLPOJOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "receiver")
public class Receiver {
    String networkoperator;
    String serviceprovider;

    public Receiver() {}

    public String getNetworkoperator() {
        return networkoperator;
    }

    public void setNetworkoperator(String networkoperator) {
        this.networkoperator = networkoperator;
    }

    public String getServiceprovider() {
        return serviceprovider;
    }

    public void setServiceprovider(String serviceprovider) {
        this.serviceprovider = serviceprovider;
    }
}
