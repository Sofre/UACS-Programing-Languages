public class FlyingCar implements Vechicle,GroundTransport,AirTransport {
    double fuelCap;
    int PassengerCap;
    String TerrainType;
    double MaxAltitude;

    public FlyingCar(double fuelCap, int passengerCap, String terrainType, double maxAltitude) {
        this.fuelCap = fuelCap;
        this.PassengerCap = passengerCap;
        this.TerrainType = terrainType;
        this.MaxAltitude = maxAltitude;
    }

    @Override
    public void drive() {
        System.out.println("Flying Car up to " + MaxAltitude);
    }

    @Override
    public String getTerrainType() {
        return TerrainType;
    }

    @Override
    public double fuel() {
        return fuelCap;
    }

    @Override
    public int getnumberPAS() {
        return PassengerCap;
    }

    @Override
    public void flying() {

    }

    @Override
    public double getMaxAltitude() {
        return MaxAltitude;
    }

}
