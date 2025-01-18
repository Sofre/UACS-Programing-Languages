package food;

abstract class MenuItem {
    public String name ;
    public String category;
    public double price;
    public int calories;

    public MenuItem(String name, String category, double price, int calories) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.calories = calories;
    }

    public MenuItem() {}

    abstract void printDetails();
    abstract double getPrice();
}
