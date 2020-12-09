package XMLPOJOs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "numberseries", propOrder = {
        "start",
        "end"
})
public class Numberseries {
    protected String start;
    protected String end;

    public Numberseries() {}

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
