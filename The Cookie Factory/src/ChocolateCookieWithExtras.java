class ChoclateCookieWithExtras extends ChocolateCookie {
   private String extras;

    public ChoclateCookieWithExtras(double weight, String shape,double precentChoclate ,String extras) {
        super(weight, shape,precentChoclate);
        this.extras = extras;
    }

@Override
public void print() {
    super.print(); // Call the parent print method
    System.out.println("Extras: " + extras);
}
}

