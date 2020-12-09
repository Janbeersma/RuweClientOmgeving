package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({
        "lastname",
        "companyname",
        "housenr",
        "housenrext",
        "postcode",
        "customerid"})
public class CustomerInfo {
    @JsonbProperty("lastname")
    public String lastname;
    @JsonbProperty("companyname")
    public String companyname;
    @JsonbProperty("housenr")
    public String housenr;
    @JsonbProperty("housenrext")
    public String housenrext;
    @JsonbProperty("postcode")
    public String postcode;
    @JsonbProperty("customerid")
    public String customerid;

    public CustomerInfo() {}

    public CustomerInfo(String lastname, String companyname, String housenr, String housenrext, String postcode, String customerid) {
        this.lastname = lastname;
        this.companyname = companyname;
        this.housenr = housenr;
        this.housenrext = housenrext;
        this.postcode = postcode;
        this.customerid = customerid;
    }

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
        return housenrext;
    }

    public void setHousenrext(String housenrext) {
        this.housenrext = housenrext;
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
