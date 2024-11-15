public class SpaceShuttle implements Vechicle,AirTransport,SpaceTransport {

    double fuelCap;
    int PassengerCap;
    double orbitRange;
    double MaxAltitude;

    public SpaceShuttle(double fuelCap, int passengerCap, double orbitRange, double maxAltitude) {
        this.fuelCap = fuelCap;
        this.PassengerCap = passengerCap;
        this.orbitRange = orbitRange;
        this.MaxAltitude = maxAltitude;
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
        System.out.println("SpaceShuttle is orbiting");

    }

    @Override
    public double getMaxAltitude() {
        return MaxAltitude;
    }

    public void setOrbitRange(double orbitRange) {
        this.orbitRange = orbitRange;
    }

    public void setMaxAltitude(double maxAltitude) {
        MaxAltitude = maxAltitude;
    }

    @Override
    public void launch() {
        System.out.println("Launch in t-minus seconds");

    }

    @Override
    public double getOrbitRange() {
        return orbitRange;
    }
}
