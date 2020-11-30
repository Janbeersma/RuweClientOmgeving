package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id","portingName","message"})
public class PortEnv {

    @JsonbProperty("id")
    public String id;
    @JsonbProperty("portingName")
    public String portingName;
    @JsonbProperty("message")
    public PortingRequestMessage message;

    public PortEnv(int i, String portforwarding, PortingRequestMessage message) {}

    public PortEnv(String id, String portingName, PortingRequestMessage message) {
        this.id = id;
        this.portingName = portingName;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPortingName() {
        return portingName;
    }

    public void setPortingName(String portingName) {
        this.portingName = portingName;
    }

    public PortingRequestMessage getMessage() {
        return message;
    }

    public void setMessage(PortingRequestMessage message) {
        this.message = message;
    }
}
