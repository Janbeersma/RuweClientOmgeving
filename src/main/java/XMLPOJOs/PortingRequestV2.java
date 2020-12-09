package XMLPOJOs;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "v2")
@XmlType(name = "v2", propOrder = {
        "dossierid",
        "recipientnetworkoperator",
        "recipientserviceprovider",
        "donornetworkoperator",
        "donorserviceprovider",
        "customerinfo",
        "note",
        "repeats"})
public class PortingRequestV2 {
    String dossierid;
    String recipientserviceprovider;
    String recipientnetworkoperator;
    String donornetworkoperator;
    String donorserviceprovider;
    String note;
    CustomerInfoXML customerinfo;
    PortingRequestV2 .Repeats repeats;


    public PortingRequestV2() {}

    public String getDossierid() {
        return dossierid;
    }

    public void setDossierid(String dossierid) {
        this.dossierid = dossierid;
    }

    public String getRecipientserviceprovider() {
        return recipientserviceprovider;
    }

    public void setRecipientserviceprovider(String recipientserviceprovider) {
        this.recipientserviceprovider = recipientserviceprovider;
    }

    public String getRecipientnetworkoperator() {
        return recipientnetworkoperator;
    }

    public void setRecipientnetworkoperator(String recipientnetworkoperator) {
        this.recipientnetworkoperator = recipientnetworkoperator;
    }

    public String getDonornetworkoperator() {
        return donornetworkoperator;
    }

    public void setDonornetworkoperator(String donornetworkoperator) {
        this.donornetworkoperator = donornetworkoperator;
    }

    public String getDonorserviceprovider() {
        return donorserviceprovider;
    }

    public void setDonorserviceprovider(String donorserviceprovider) {
        this.donorserviceprovider = donorserviceprovider;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CustomerInfoXML getCustomerinfo() {
        return customerinfo;
    }

    public void setCustomerinfo(CustomerInfoXML customerinfo) {
        this.customerinfo = customerinfo;
    }

    public PortingRequestV2.Repeats getRepeats() {
        return repeats;
    }

    public void setRepeats(PortingRequestV2.Repeats value) {
        this.repeats = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "repeats", propOrder = "seq")
    public static class Repeats {

        @XmlElement(required = true)
        protected List<PortingRequestSequenceV2> seq;

        public List<PortingRequestSequenceV2> getSeq() {
            if (seq == null) {
                seq = new ArrayList<PortingRequestSequenceV2>();
            }
            return this.seq;
        }
    }
}


