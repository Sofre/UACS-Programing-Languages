public class Car extends  Vehicle {


    public int numDoors;
    public String fuelType;

    public Car(String make, String model, int year, double dailyRate,int numDoors,String fuelType) {
        super(make, model, year, dailyRate);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public Car(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    void printDetails() {
        System.out.println("Make:  "+make);
        System.out.println("Model:  "+model);
        System.out.println("Year:   "+year);
        System.out.println("Daily Rate  "+dailyRate);
        System.out.println("Number of doors:  "+numDoors);
        System.out.println("Fuel type:  "+fuelType);

    }

    @Override
    double getDailyRate() {
        return dailyRate;
    }
}
