package XMLPOJOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "header")
public class Header {
    String test;
    Receiver receiver;
    Sender sender;
    String timestamp;

    public Header() {}

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
