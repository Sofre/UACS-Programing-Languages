public class Cube implements ThreeDimensionalShape{

    double side;

    public Cube(double side) {
        this.side = side;
    }

    public double area(){
        return side*side;
    }

    public double perimeter(){
        return 4*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }



}
