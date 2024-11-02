 class ChocolateCookie extends Cookie {
    private double precentChocolate;


    public ChocolateCookie(double weight,String shape,double precentChocolate) {
        super(weight,shape);
        this.precentChocolate = precentChocolate;

    }

    public void precentChocolate() {}

    @Override
    public void print() {
        super.print();
        System.out.println("Chocolate: " + precentChocolate);
    }

}
