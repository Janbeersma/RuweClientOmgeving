package POJOs;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonbPropertyOrder({"dossierId",
        "recipientserviceprovider",
        "recipientnetworkoperator",
        "donornetworkoperator",
        "donorserviceprovider",
        "customerinfo",
        "note",
        "repeats"})
public class PortingRequest {
    @JsonbProperty("dossierId")
    public String dossierId;
    @JsonbProperty("recipientserviceprovider")
    public String recipientserviceprovider;
    @JsonbProperty("recipientnetworkoperator")
    public String recipientnetworkoperator;
    @JsonbProperty("donornetworkoperator")
    public String donornetworkoperator;
    @JsonbProperty("donorserviceprovider")
    public String donorserviceprovider;
    @JsonbProperty("customerinfo")
    public CustomerInfo customerInfo;
    @JsonbProperty("notes")
    public String notes;
    @JsonbProperty("repeats")
    public PortingRequest .Repeats repeats;

    public PortingRequest() {}

    public PortingRequest(String dossierId, String recipientserviceprovider, String recipientnetworkoperator, String donornetworkoperator, String donorserviceprovider, CustomerInfo customerInfo, String notes, Repeats repeats) {
        this.dossierId = dossierId;
        this.recipientserviceprovider = recipientserviceprovider;
        this.recipientnetworkoperator = recipientnetworkoperator;
        this.donornetworkoperator = donornetworkoperator;
        this.donorserviceprovider = donorserviceprovider;
        this.customerInfo = customerInfo;
        this.notes = notes;
        this.repeats = repeats;
    }

    public String getDossierId() {
        return dossierId;
    }

    public void setDossierId(String dossierId) {
        this.dossierId = dossierId;
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

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public PortingRequest.Repeats getRepeats() {
        return repeats;
    }

    public void setRepeats(PortingRequest.Repeats repeats) {
        this.repeats = repeats;
    }

    public static class Repeats {
        @JsonbProperty("seq")
        protected List<PortingRequestSequence> seq;

        public List<PortingRequestSequence> getSeq() {
            if (seq == null) {
                seq = new ArrayList<PortingRequestSequence>();
            }
            return this.seq;
        }
    }
}
