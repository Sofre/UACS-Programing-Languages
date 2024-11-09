public class Main {
    public static void main(String[] args) {
        Product[] prod = new Product[3];
        prod[0] = new Product("Laptop",101,1200);
        prod[1] = new Product("Smartphone",102,800);
        prod[2] = new Product("Tablet",103,500);

        for(Product p : prod){
           p.displayProductInfo();
        }System.out.println();
        System.out.println("Applying 10% discount");
        System.out.println();
        for(Product p : prod){
           p.applyDiscount();
          p.displayProductInfo();
}
    }
}