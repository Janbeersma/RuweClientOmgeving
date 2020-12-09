package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"receiver", "sender", "timestamp"})
public class PortingRequestHeader {
    @JsonbProperty("receiver")
    public PortingRequestReceiver receiver;
    @JsonbProperty("sender")
    public PortingRequestSender sender;
    @JsonbProperty("timestamp")
    public String timestamp;

    public PortingRequestHeader() {}

    public PortingRequestReceiver getReceiver() {
        return receiver;
    }

    public void setReceiver(PortingRequestReceiver receiver) {
        this.receiver = receiver;
    }

    public PortingRequestSender getSender() {
        return sender;
    }

    public void setSender(PortingRequestSender sender) {
        this.sender = sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
