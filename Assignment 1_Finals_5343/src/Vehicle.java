public abstract  class Vehicle {

    public String make;
    public String model;
    public int year;
    public double dailyRate;

    public Vehicle(String make, String model, int year, double dailyRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
    }

    public Vehicle() {
    }

    abstract void printDetails();
    abstract double getDailyRate();

}
