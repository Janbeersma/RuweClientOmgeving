package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id","portingName","message"})
public class PortEnv {

    @JsonbProperty("id")
    public int id;
    @JsonbProperty("portingName")
    public String portingName;
    @JsonbProperty("message")
    public PortingRequestMessage message;

    public PortEnv() {}

    public PortEnv(int id, String portingName, PortingRequestMessage message) {
        this.id = id;
        this.portingName = portingName;
        this.message = message;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
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
