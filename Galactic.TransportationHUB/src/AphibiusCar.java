public class AphibiusCar implements GroundTransport , Vechicle{
    public double fuelcap;
    public int passengers;
    public String terrainType;

    public AphibiusCar(double fuelcap, int passengers, String terrainType) {
        this.fuelcap = fuelcap;
        this.passengers = passengers;
        this.terrainType = terrainType;
    }

    @Override
    public void drive() {
        System.out.println("Car drives");
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }

    @Override
    public double fuel() {
        return fuelcap;
    }

    @Override
    public int getnumberPAS() {
        return passengers;
    }
}
