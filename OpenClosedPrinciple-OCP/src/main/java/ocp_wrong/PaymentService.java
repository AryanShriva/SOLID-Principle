package ocp_wrong;

public class PaymentService {

    public void processPayment(String type) {
        if (type.equals("creditcard")) {
            System.out.println("Processing credit card payment...");
        } else if (type.equals("upi")) {
            System.out.println("Processing UPI payment...");
        } else if (type.equals("paypal")) {
            System.out.println("Processing PayPal payment...");
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
