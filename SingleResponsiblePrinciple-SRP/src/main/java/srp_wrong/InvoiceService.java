package srp_wrong;

public class InvoiceService {

    public void createInvoice(Invoice invoice) {
        // 1️⃣ Validate invoice
        if (invoice.getTotalAmount() <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        // 2️⃣ Save to database (simulate)
        System.out.println("Saving invoice to database...");

        // 3️⃣ Send email notification (simulate)
        System.out.println("Sending invoice email to: " + invoice.getCustomerEmail());
    }
}
