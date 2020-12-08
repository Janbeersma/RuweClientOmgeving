package XMLPOJOs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
public class Message {

    int id;
    String test;
    Body body;
    Header header;

    public Message() {}

    public Message(int id, String test, Body body, Header header) {
        this.id = id;
        this.test = test;
        this.body = body;
        this.header = header;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
