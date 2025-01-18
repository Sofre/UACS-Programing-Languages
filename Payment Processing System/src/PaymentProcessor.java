public class PaymentProcessor {
    public void setPaymentmethod(Payment paymentmethod,double amount){
        if(paymentmethod.processPayment(amount)){
            System.out.println("Payment successful ");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
