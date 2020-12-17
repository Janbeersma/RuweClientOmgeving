package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({
        "body",
        "header"})
public class PortingRequestMessage {

    @JsonbProperty("body")
    public PortingRequestBody body;
    @JsonbProperty("header")
    public PortingRequestHeader header;

    public PortingRequestMessage() {}


    public PortingRequestBody getBody() {
        return body;
    }

    public void setBody(PortingRequestBody body) {
        this.body = body;
    }

    public PortingRequestHeader getHeader() {
        return header;
    }

    public void setHeader(PortingRequestHeader header) {
        this.header = header;
    }
}


