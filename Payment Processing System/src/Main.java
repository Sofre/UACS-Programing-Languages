import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentmethod(new CreditCard(),100.00);
        processor.setPaymentmethod(new PayPal(),250.00);
        processor.setPaymentmethod(new Cyprto(),250.00);
    }
}