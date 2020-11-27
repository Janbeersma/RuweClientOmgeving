package XMLPOJOs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "v2")
public class PortingRequestV2 {

    String dossierid;
    String recipientserviceprovider;
    String recipientnetworkoperator;
    String donornetworkoperator;
    String donorserviceprovider;
    String note;
    CustomerInfoXML customerinfo;

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
}
