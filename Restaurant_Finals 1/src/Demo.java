import food.MainDish;
import food.Dessert;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<MainDish> mainDishItems = new ArrayList<>();
        List<Dessert> dessertItems = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add Main Dish");
            System.out.println("2. Add Dessert");
            System.out.println("3. Display all menu items");
            System.out.println("4. Find item with the longest cook time");
            System.out.println("5. Find most expensive item");
            System.out.println("6. Calculate avg price");
            System.out.println("7. Exit");

            int option = sc.nextInt();
            sc.nextLine();  // Consume the newline character after nextInt()

            switch (option) {
                case 1:
                    // Add Main Dish
                    System.out.print("Enter main dish name: ");
                    String mainDishName = sc.nextLine();
                    System.out.print("Enter price of main dish: ");
                    double mainDishPrice = sc.nextDouble();
                    System.out.print("Enter cook time for main dish (in minutes): ");
                    int mainDishCookTime = sc.nextInt();
                    sc.nextLine();  // Consume the newline character
                    System.out.print("Is it vegetarian? (yes/no): ");
                    boolean isVegetarian = sc.nextLine().equalsIgnoreCase("yes");
                    System.out.print("How many calories? ");
                    int mainDishCalories = sc.nextInt();
                    sc.nextLine();  // Consume the newline character

                    MainDish mainDish = new MainDish(mainDishName, "Main Dish", mainDishPrice, mainDishCalories, mainDishCookTime, isVegetarian);
                    mainDishItems.add(mainDish);
                    System.out.println("Main dish added!");
                    break;

                case 2:
                    // Add Dessert
                    System.out.print("Enter dessert name: ");
                    String dessertName = sc.nextLine();
                    System.out.print("Enter price of dessert: ");
                    double dessertPrice = sc.nextDouble();
                    System.out.print("Enter cook time for dessert (in minutes): ");
                    int dessertCookTime = sc.nextInt();
                    sc.nextLine();  // Consume the newline character

                    Dessert dessert = new Dessert(dessertName, "Dessert", dessertPrice, 0, dessertCookTime, false);
                    dessertItems.add(dessert);
                    System.out.println("Dessert added!");
                    break;

                case 3:
                    // Display all menu items
                    System.out.println("\nMain Dishes:");
                    for (MainDish dish : mainDishItems) {
                        dish.printDetails();
                    }

                    System.out.println("\nDesserts:");
                    for (Dessert d : dessertItems) {
                        d.printDetails();
                    }
                    break;

                case 4:
                    break;

                case 5:

                    MainDish mostExpensiveMainDish = null;
                    Dessert mostExpensiveDessert = null;
                    double maxPriceMainDish = -1;
                    double maxPriceDessert = -1;

                    for (MainDish dish : mainDishItems) {
                        if (dish.getPrice() > maxPriceMainDish) {
                            maxPriceMainDish = dish.getPrice();
                            mostExpensiveMainDish = dish;
                        }
                    }

                    for (Dessert d : dessertItems) {
                        if (d.getPrice() > maxPriceDessert) {
                            maxPriceDessert = d.getPrice();
                            mostExpensiveDessert = d;
                        }
                    }

                    System.out.println("Most expensive Main Dish: " + (mostExpensiveMainDish != null ? mostExpensiveMainDish.getName() : "None") + " ($" + maxPriceMainDish + ")");
                    System.out.println("Most expensive Dessert: " + (mostExpensiveDessert != null ? mostExpensiveDessert.getName() : "None") + " ($" + maxPriceDessert + ")");
                    break;

                case 6:

                    double totalPrice = 0;
                    int totalItems = 0;

                    for (MainDish dish : mainDishItems) {
                        totalPrice += dish.getPrice();
                        totalItems++;
                    }

                    for (Dessert d : dessertItems) {
                        totalPrice += d.getPrice();
                        totalItems++;
                    }

                    if (totalItems > 0) {
                        System.out.println("Average price: $" + (totalPrice / totalItems));
                    } else {
                        System.out.println("No items available to calculate average price.");
                    }
                    break;

                case 7:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
