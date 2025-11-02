package srp_wrong;

public class Invoice {
    private String id;
    private double totalAmount;
    private String customerEmail;

    public Invoice(String id, double totalAmount, String customerEmail) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.customerEmail = customerEmail;
    }

    public String getId() {
        return id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
