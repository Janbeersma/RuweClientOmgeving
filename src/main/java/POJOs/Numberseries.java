package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;

@JsonbPropertyOrder({
        "start",
        "end"
})
public class Numberseries {
    @JsonbProperty("start")
    protected String start;
    @JsonbProperty("end")
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
