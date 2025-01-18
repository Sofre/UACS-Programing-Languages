public class CreditCard implements Payment {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment : $"+ amount);
        return true;
    }
}
