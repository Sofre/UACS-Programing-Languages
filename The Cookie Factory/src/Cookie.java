 class Cookie {
    private double weight;
    private String shape;

    public Cookie(double weight, String shape) {
        this.weight = weight;
        this.shape = shape;
    }

    public void print(){
        System.out.println("Cookie Details:");
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Shape: " + shape);
    }

}
