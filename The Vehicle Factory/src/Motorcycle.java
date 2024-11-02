import java.util.Random;

public class Motorcycle extends Vehicle {
    private int wheels;
    private int fuel;
    Random random = new Random();

    public Motorcycle(int wheels, int fuel) {
        this.wheels = wheels;
        this.fuel = fuel;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void move() {
        if(wheels==2) {
            System.out.println("This is a motorcycle.. it moves on two wheels");
        }
        else
        {
            System.out.println("This is not  a motorcycle");
        }
    }

    @Override
    public void refuel() {
        System.out.println("The fuel amount is  " + fuel+"litters");
    }
}
