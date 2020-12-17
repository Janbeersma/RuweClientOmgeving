package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder("teststring")
public class TestClass {
    @JsonbProperty("teststring")
    public String testString;

    public TestClass() {}

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
