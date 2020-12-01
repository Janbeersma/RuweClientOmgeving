package XMLPOJOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customerinfo")
public class CustomerInfoXML {
    String lastname;
    String companyname;
    String housenr;
    String getHousenrext;
    String postcode;
    String customerid;

    public CustomerInfoXML() {}

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getHousenr() {
        return housenr;
    }

    public void setHousenr(String housenr) {
        this.housenr = housenr;
    }

    public String getHousenrext() {
        return getHousenrext;
    }

    public void setHousenrext(String getHousenrext) {
        this.getHousenrext = getHousenrext;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
}
