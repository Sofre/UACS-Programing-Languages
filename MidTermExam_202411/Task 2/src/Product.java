public class Product {
    String productName;
    int productId;
    int price;

    public Product(String productName, int productId, int price) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void applyDiscount(){
      double  precentage = 0.1;
        double left_over = price * precentage;
        price = price - (int) left_over;



    }
    public void displayProductInfo(){
        System.out.println("Product:   "+ productName +", "+"ID:    "+ productId+" ,"+"Price:    $"+price+".0");

    }

}
