package ocp_wrong;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.processPayment("creditcard");
        service.processPayment("upi");
    }
}
