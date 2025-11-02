package ocp_correct;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.makePayment(new CreditCardPayment());
        service.makePayment(new UpiPayment());
    }
}
