package ocp_correct;

public class CreditCardPayment implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}
