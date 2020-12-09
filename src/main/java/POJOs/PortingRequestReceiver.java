package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"networkoperator", "serviceprovider"})
public class PortingRequestReceiver {
    @JsonbProperty("networkoperator")
    public String networkoperator;
    @JsonbProperty("serviceprovider")
    public String serviceprovider;

    public PortingRequestReceiver() {}

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
