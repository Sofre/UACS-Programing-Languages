public class ACCOUNT {
    public String Bank;
    public int amount;

    public ACCOUNT(String bank, int amount) {
        Bank = bank;
        this.amount = amount;
    }

    public String getBank() {
        return Bank;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int add(int plus){
        return amount + plus;

    }
    public int withdraw(int minus){
        return  amount - minus;
    }
}
