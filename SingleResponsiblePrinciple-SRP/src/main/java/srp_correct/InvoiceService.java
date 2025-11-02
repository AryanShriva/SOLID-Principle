package srp_correct;

public class InvoiceService {

    private final InvoiceValidator validator;
    private final InvoiceRepository repository;
    private final InvoiceEmailSender emailSender;

    public InvoiceService(InvoiceValidator validator, InvoiceRepository repository, InvoiceEmailSender emailSender) {
        this.validator = validator;
        this.repository = repository;
        this.emailSender = emailSender;
    }

    public void createInvoice(Invoice invoice) {
        validator.validate(invoice);
        repository.save(invoice);
        emailSender.sendEmail(invoice);
    }
}
