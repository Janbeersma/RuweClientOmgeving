package XMLPOJOs;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "portingrequestsequencev2")
@XmlType(name = "portingrequestsequencev2", propOrder = {
        "numberseries",
        "repeats"
})
public class PortingRequestSequenceV2 {
    protected Numberseries numberseries;
    protected PortingRequestSequenceV2 .Repeats repeats;

    public PortingRequestSequenceV2() {}

    public Numberseries getNumberseries() {
        return numberseries;
    }

    public void setNumberseries(Numberseries numberseries) {
        this.numberseries = numberseries;
    }

    public Repeats getRepeats() {
        return repeats;
    }

    public void setRepeats(PortingRequestSequenceV2.Repeats value) {
        this.repeats = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "seq"
    })
    public static class Repeats {
        protected List<EnumProfileSequence> seq;

        public List<EnumProfileSequence> getSeq() {
            if (seq == null) {
                seq = new ArrayList<EnumProfileSequence>();
            }
            return this.seq;
        }

    }
}
