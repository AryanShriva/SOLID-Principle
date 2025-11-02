package ocp_correct;

public class PaymentService {
    public void makePayment(PaymentProcessor processor) {
        processor.processPayment();
    }
}
