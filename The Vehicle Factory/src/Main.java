//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(4,50);
        Vehicle vehicle2 = new Motorcycle(2,35);
        Vehicle vehicle3 = new ElectricCar(4,"5");

        System.out.println();
        vehicle1.move();
        vehicle1.refuel();
        System.out.println();
        vehicle2.move();
        vehicle2.refuel();
        System.out.println();
        vehicle3.move();
        vehicle3.refuel();

        if(vehicle3 instanceof ElectricCar){
            ((ElectricCar)vehicle3).refuel(2);
        }


        }

}