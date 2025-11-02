package srp_wrong;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("INV001", 2500, "client@example.com");
        InvoiceService service = new InvoiceService();
        service.createInvoice(invoice);
    }
}
