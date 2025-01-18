package food;

public class MainDish extends MenuItem{

    public int cookTime;
    public boolean isVegetarian;

    public MainDish(String name, String mainDish, double price, int calories, int cookTime, boolean isVegetarian) {
        super(name, "Main Dish", price, calories);
        this.cookTime = cookTime;
        this.isVegetarian = isVegetarian;
    }

    public MainDish() {}

    @Override
    public void printDetails() {
        System.out.println("Main Dish: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Cook Time: " + cookTime + " minutes");
        System.out.print("Is the dish vegetarian :  " + isVegetarian);
    }

    @Override
    public double getPrice() {
        return price;
    }
    public int getCookTime() {
        return cookTime;
    }


    public boolean isVegetarian() {
        return isVegetarian;
    }
    public String getName(){

        return name;
    }


}

