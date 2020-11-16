package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"maxItems","minItems","PortingRequestRepeats"})
public class Repeats {
    @JsonbProperty("maxItems")
    public long maxItems;
    @JsonbProperty("minItems")
    public int minItems;
    @JsonbProperty("PortingRequestRepeats")
    public PortingRequestRepeats portingRequestRepeats;


    public Repeats() {}

    public Repeats(long maxItems, int minItems, PortingRequestRepeats portingRequestRepeats) {
        this.maxItems = maxItems;
        this.minItems = minItems;
        this.portingRequestRepeats = portingRequestRepeats;
    }

    public long getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(long maxItems) {
        this.maxItems = maxItems;
    }

    public int getMinItems() {
        return minItems;
    }

    public void setMinItems(int minItems) {
        this.minItems = minItems;
    }

    public PortingRequestRepeats getPortingRequestRepeats() {
        return portingRequestRepeats;
    }

    public void setPortingRequestRepeats(PortingRequestRepeats portingRequestRepeats) {
        this.portingRequestRepeats = portingRequestRepeats;
    }
}
