import java.io.InputStream;
import java.util.Scanner;
import java.util.Random;
public class Car {
    public String make;
    public String model;
    public int year;
    public String color;
    public int numberOfDoors;
    public int numberOfSeats;
    public int BHP;
    public double price;



    public Car(InputStream in) {
    }



    public void Info_Set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Make: ");
        make = sc.nextLine();
        System.out.println("Model: ");
        model = sc.nextLine();
        System.out.println("Year: ");
        year = sc.nextInt();
        System.out.println("Number of Doors: ");
        numberOfDoors = sc.nextInt();
        System.out.println("Number of Seats: ");
        numberOfSeats = sc.nextInt();
        sc.nextLine();
        System.out.println("Color: ");
        color = sc.nextLine();
        System.out.println("BHP: ");
        BHP = sc.nextInt();
        Set_Price();

    }
    public void Set_Price(){
        Random rand = new Random();
        double min = 35000.00;
        double max = 90000.00;
        this.price = min + (max - min) * rand.nextDouble();
    }
    public void Display_Car_Show(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("BHP:  " + BHP);
        System.out.println("Car Price: $" + String.format("%.2f", price));

    }

    public int getBHP() {
        return BHP;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
