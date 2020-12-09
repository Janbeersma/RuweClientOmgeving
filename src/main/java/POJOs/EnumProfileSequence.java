package POJOs;

import javax.json.bind.annotation.JsonbProperty;

public class EnumProfileSequence {
    @JsonbProperty("profileid")
    protected String profileid;

    public EnumProfileSequence() {}

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }
}
