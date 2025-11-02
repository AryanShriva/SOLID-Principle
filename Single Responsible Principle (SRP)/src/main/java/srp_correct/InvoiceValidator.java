package srp_correct;

public class InvoiceValidator {

    public void validate(Invoice invoice) {
        if (invoice.getTotalAmount() <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (invoice.getCustomerEmail() == null || invoice.getCustomerEmail().isEmpty()) {
            throw new IllegalArgumentException("Customer email must not be empty");
        }
        System.out.println("Invoice validated successfully.");
    }
}
