package ocp_correct;

public class UpiPayment implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment...");
    }
}
