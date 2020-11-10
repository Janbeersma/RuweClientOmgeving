package POJOs;

import javax.json.bind.annotation.JsonbProperty;

public class PortingRequestMessage {

    @JsonbProperty("body")
    public PortingRequestBody body;

    public PortingRequestMessage() {}

    public PortingRequestMessage(PortingRequestBody body) {
        this.body = body;
    }

    public PortingRequestBody getBody() {
        return body;
    }

    public void setBody(PortingRequestBody body) {
        this.body = body;
    }
}


