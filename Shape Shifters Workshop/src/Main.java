public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        Cube cube = new Cube(5.0);
        Square square = new Square(2.0);


        System.out.println(square.area());
        System.out.println(square.peremitar());
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(cube.area());
        System.out.println(cube.volume());
        System.out.println(cube.perimeter());


    }
}