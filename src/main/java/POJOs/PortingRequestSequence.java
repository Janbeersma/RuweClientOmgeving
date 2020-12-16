package POJOs;

import XMLPOJOs.Numberseries;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonbPropertyOrder({
        "numberseries",
        "repeats"
})
public class PortingRequestSequence {
    @JsonbProperty("numberseries")
    protected Numberseries numberseries;
    @JsonbProperty("repeats")
    protected PortingRequestSequence .Repeats repeats;

    public PortingRequestSequence() {}

    public Numberseries getNumberseries() {
        return numberseries;
    }

    public void setNumberseries(Numberseries numberseries) {
        this.numberseries = numberseries;
    }

    public PortingRequestSequence.Repeats getRepeats() {
        return repeats;
    }

    public void setRepeats(PortingRequestSequence.Repeats repeats) {
        this.repeats = repeats;
    }

    public static class Repeats {
        @JsonbProperty("seq")
        protected List<EnumProfileSequence> seq;

        public List<EnumProfileSequence> getSeq() {
            if (seq == null) {
                seq = new ArrayList<EnumProfileSequence>();
            }
            return this.seq;
        }

        public void setSeq(List<EnumProfileSequence> seq) {
            this.seq = seq;
        }
    }
}
