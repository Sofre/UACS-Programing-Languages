public class Main {
    public static void main(String[] args) {
        AphibiusCar aphibiusCar = new AphibiusCar(50.0,4,"mixed");
        FlyingCar flyingCar = new FlyingCar(60.0,4,"Urban road",1000.0);
        SpaceShuttle spaceShuttle = new SpaceShuttle(1000.0,2,6000.0,50.0);

        aphibiusCar.drive();
        System.out.println(aphibiusCar.fuel());
        System.out.println(aphibiusCar.getnumberPAS());
        System.out.println(aphibiusCar.getTerrainType());

        flyingCar.drive();
        System.out.println(flyingCar.fuel());
        System.out.println(flyingCar.getMaxAltitude());
        System.out.println(flyingCar.getnumberPAS());
        System.out.println(flyingCar.getTerrainType());

        spaceShuttle.flying();
        System.out.println(spaceShuttle.fuel());
        System.out.println(spaceShuttle.getnumberPAS());
        System.out.println(spaceShuttle.getMaxAltitude());
        System.out.println(spaceShuttle.getOrbitRange());
    }
}