package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"message"})
public class PortEnv {
    @JsonbProperty("message")
    public PortingRequestMessage message;

    public PortEnv() {}

    public PortEnv(PortingRequestMessage message) {
        this.message = message;
    }

    public PortingRequestMessage getMessage() {
        return message;
    }

    public void setMessage(PortingRequestMessage message) {
        this.message = message;
    }
}
