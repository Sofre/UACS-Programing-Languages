public class ElectricCar extends Vehicle {
    private int wheels;
    private String Charging_Time;

    ElectricCar(int wheels, String Charging_Time) {
        this.wheels = wheels;
        this.Charging_Time = Charging_Time;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setCharging_Time(String charging_Time) {
        Charging_Time = charging_Time;
    }

    @Override
    void move() {
        if(wheels==4) {
            System.out.println("This is a car.. it moves on four wheels)");
        }
        else{
            System.out.println("This is not a car");
        }
    }

    @Override
    void refuel() {
        System.out.println("Electric charging");
    }
    public void refuel(int Charging_Time){
        System.out.println("Charging Time: " + Charging_Time+"hours");
    }
}
