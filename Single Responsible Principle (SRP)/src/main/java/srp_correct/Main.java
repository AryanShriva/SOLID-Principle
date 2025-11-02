package srp_correct;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("INV001", 2500, "client@example.com");

        InvoiceValidator validator = new InvoiceValidator();
        InvoiceRepository repository = new InvoiceRepository();
        InvoiceEmailSender emailSender = new InvoiceEmailSender();

        InvoiceService service = new InvoiceService(validator, repository, emailSender);
        service.createInvoice(invoice);
    }
}
