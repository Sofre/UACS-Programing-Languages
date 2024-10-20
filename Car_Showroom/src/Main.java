import java.util.*;
public class Main {


    public static Car Strongest_Car(Car[] x) {
        if (x.length == 0) {
            throw new IllegalArgumentException();
        }

        Car max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i].getBHP() > max.getBHP()) {
                max = x[i];
            }
        }
        return max;
    }

    public static Car Cheapest_Car(Car[] x) {
        if (x.length == 0) {
            throw new IllegalArgumentException();
        }
        Car min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i].getPrice() < min.getPrice()) {
                min = x[i];
            }
        }
        return min;
    }

    public static Car Most_Expensive_Car(Car[] x) {
        if (x.length == 0) {
            throw new IllegalArgumentException();

        }
        Car max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i].getPrice() > max.getPrice()) {
                max = x[i];
            }
        }

        return max;
    }

    public static Car Best_Car(Car[] x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        Car best = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i].getBHP() > best.getBHP() && x[i].getPrice() > best.getPrice() && x[i].getYear()<best.getYear()) {
                best = x[i];
            }
        }
        return best;
    }

        public static void main (String[] args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of cars that will take part in the show :     ");
            int number_of_cars = sc.nextInt();
            Car[] cars = new Car[number_of_cars];
            for (int i = 0; i < cars.length; i++) {
                cars[i] = new Car(System.in);
                cars[i].Info_Set();
                System.out.println("  ");

            }
            System.out.println("Cars on the Auto show:  ");
            for (Car car : cars) {
                car.Display_Car_Show();
                System.out.println("  ");
            }
            System.out.println("The Strongest car is: ");
            Car strongest = Strongest_Car(cars);
            strongest.Display_Car_Show();

            System.out.println("     ");

            System.out.println("The Cheapest car is: ");
            Car cheapest = Cheapest_Car(cars);
            cheapest.Display_Car_Show();

            System.out.println("     ");

            System.out.println("The Most Expensive car is: ");
            Car mostExpensive = Most_Expensive_Car(cars);
            mostExpensive.Display_Car_Show();

            System.out.println("     ");

            System.out.println("The Best Car and Winner is: ");
            Car best = Best_Car(cars);
            best.Display_Car_Show();



        }


}



