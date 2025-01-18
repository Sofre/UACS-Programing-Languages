import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        List<Van> vanList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMenu");
            System.out.println("1. Add Car");
            System.out.println("2. Add Van");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Find cheapest vehicle");
            System.out.println("5. Find most expensive vehicle");
            System.out.println("6. Calculate avg daily rate");
            System.out.println("7. Exit");


            System.out.println();
            System.out.println("Enter numerical number from 1-7 !");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.print("Enter car manufacturer: ");
                    String carMake = sc.nextLine();
                    System.out.print("Car model:  ");
                    String carModel = sc.nextLine();
                    System.out.print("Enter the year of the car:  ");
                    int car_Year = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the daily rate:  ");
                    double daily_RATE = sc.nextDouble();
                    System.out.print("How many number of doors does the car have: ");
                    int num_of_doorsCAR = sc.nextInt();
                    System.out.print("Whats the fuel type :  ");
                    String fuel_car = sc.nextLine();
                    sc.nextLine();

                   Car car = new Car(carMake,carModel,car_Year,daily_RATE,num_of_doorsCAR,fuel_car);
                    carList.add(car);
                    System.out.println("Car added to list");
                    continue;


                case 2:
                    System.out.print("Enter van manufacturer: ");
                    String vanMake = sc.nextLine();
                    System.out.print("Van model:  ");
                    String vanModel = sc.nextLine();
                    System.out.print("Enter the year of the van:  ");
                    int van_Year = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the daily rate:  ");
                    double van_daily_RATE = sc.nextDouble();
                    System.out.println("Whats the van's cargo capacity: ");
                    int van_cargo = sc.nextInt();
                    System.out.println("How many seats does the van have: ");
                    int seats_van = sc.nextInt();

                    sc.nextLine();

                    Van van = new Van(vanMake,vanModel,van_Year,van_daily_RATE,van_cargo,seats_van);
                    vanList.add(van);
                    continue;



                case 3:
                    System.out.println("Displaying Cars: ");
                    for (Car c : carList){
                        c.printDetails();
                    }
                    System.out.println("Displaying Vans: ");
                    for (Van v : vanList){
                        v.printDetails();
                    }
                   continue;


                case 4:
                    Car mostCheapCar = null;
                    Van mostCheapVan = null;
                    double minPriceCar = 0;
                    double minPriceVan = 0;


                    for(Car r : carList){
                        if(r.getDailyRate()>minPriceCar){
                            minPriceCar = r.getDailyRate();
                            mostCheapCar = r;
                        }
                    }
                    for(Van n: vanList){
                        if(n.getDailyRate() > minPriceVan){
                            minPriceVan = n.getDailyRate();
                            mostCheapVan = n;
                        }
                    }
                    System.out.println("Most expensive Car:"+(mostCheapCar != null ? mostCheapCar.make: "None") + " ($ "+ minPriceCar + ")");
                    System.out.println("Most expensive Van:"+(mostCheapVan != null ? mostCheapVan.make: "None") + " ($ "+ minPriceVan + ")");
                    continue;

                case 5:
                    Car mostExpensiveCar = null;
                    Van mostExpensiveVan = null;
                    double maxPriceCar = -1;
                    double maxPriceVan = -1;


                    for(Car r : carList){
                        if(r.getDailyRate()>maxPriceCar){
                            maxPriceCar = r.getDailyRate();
                            mostExpensiveCar = r;
                        }
                    }
                    for(Van n: vanList){
                        if(n.getDailyRate() > maxPriceVan){
                            maxPriceVan = n.getDailyRate();
                            mostExpensiveVan = n;
                        }
                    }
                    System.out.println("Most expensive Car:"+(mostExpensiveCar != null ? mostExpensiveCar.make: "None") + " ($ "+ maxPriceCar + ")");
                    System.out.println("Most expensive Van:"+(mostExpensiveVan != null ? mostExpensiveVan.make: "None") + " ($ "+ maxPriceVan + ")");
                   continue;

                case 6:
                    Car ratec = null;
                    Van ratev = null;
                    double CarRate = 0;
                    double VanRate = 0;

                    for(Car r : carList){
                        CarRate+=r.getDailyRate();
                        ratec = r;
                    }
                    for(Van n : vanList){
                        VanRate+= n.getDailyRate();
                        ratev = n;
                    }

                    double lenght_car = carList.size();
                    double lenght_van = vanList.size();

                    double average_car = CarRate/lenght_car;
                    double average_van = VanRate/lenght_van;

                    System.out.println("The average daily rate for car is : "+average_car);
                    System.out.println("The average daily rate for van is : "+average_van);
                    continue;


                case 7:
                    System.out.println("You have pressed Exit !");
                    break;







            }


        }
    }
}