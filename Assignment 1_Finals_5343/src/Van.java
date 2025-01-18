public class Van extends Vehicle {


    public int cargoCapacity;
    public int numSeats;

    public Van(String make, String model, int year, double dailyRate, int cargoCapacity, int numSeats) {
        super(make, model, year, dailyRate);
        this.cargoCapacity = cargoCapacity;
        this.numSeats = numSeats;
    }

    public Van(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    void printDetails() {
        System.out.println("Make:  "+make);
        System.out.println("Model:  "+model);
        System.out.println("Year:   "+year);
        System.out.println("Daily Rate  "+dailyRate);
        System.out.println("Cargo capacity: "+cargoCapacity);
        System.out.println("Number of seats: "+numSeats);

    }

    @Override
    double getDailyRate() {
        return dailyRate;
    }
}
