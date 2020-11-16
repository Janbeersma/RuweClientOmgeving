package POJOs;

import javax.json.bind.annotation.JsonbProperty;

public class PortingRequestBody {
    @JsonbProperty("portingRequest")
    public PortingRequest portingRequest;

    public PortingRequestBody() {}

    public PortingRequestBody(PortingRequest portingRequest) {
        this.portingRequest = portingRequest;
    }

    public PortingRequest getPortingRequest() {
        return portingRequest;
    }

    public void setPortingRequest(PortingRequest portingRequest) {
        this.portingRequest = portingRequest;
    }
}
