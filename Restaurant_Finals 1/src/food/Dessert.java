package food;

public class Dessert extends MenuItem {

    public int sugarContent;
    public boolean hasNuts;


    public Dessert(String name, String dessert, double price, int calories, int sugarContent, boolean hasNuts) {
        super(name,"Desserts",price,calories);
        this.sugarContent = sugarContent;
        this.hasNuts = hasNuts;
    }

    public Dessert() {}

    @Override
    public void printDetails() {
        System.out.println("Dessert: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.print("The content of sugar is : " + sugarContent);
        System.out.print("Does it have nuts " + hasNuts);

    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }
    public String getName(){

        return name;
    }


}
