package POJOs;

import javax.json.bind.annotation.JsonbProperty;

public class PortingRequestRepeats {
    @JsonbProperty("seq")
    public PortingRequestSequence seq;

    public PortingRequestRepeats() {}

    public PortingRequestRepeats(PortingRequestSequence seq) {
        this.seq = seq;
    }

    public PortingRequestSequence getSeq() {
        return seq;
    }

    public void setSeq(PortingRequestSequence seq) {
        this.seq = seq;
    }
}
