
import java.util.Scanner;

public class Car extends Vehicle {
    private int wheels;
    private int fuel;


    Car(int wheels, int fuel) {
        this.wheels = wheels;
        this.fuel = fuel;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    Scanner input = new Scanner(System.in);
    @Override
    public void move() {

        if(wheels==4) {
            System.out.println("This is a car.. it moves on four wheels");

        }
        else{
            System.out.println("This is not a car");
        }
    }

    @Override
    public void refuel() {

        System.out.println("Its fuel amount is "+fuel+"litters");
    }
}
