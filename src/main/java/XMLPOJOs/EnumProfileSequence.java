package XMLPOJOs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "enumoperatorsequence")
@XmlType(name = "enumoperatorsequence", propOrder = {
        "profileid",
})
public class EnumProfileSequence {
    protected String profileid;

    public EnumProfileSequence() {}

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }

}
