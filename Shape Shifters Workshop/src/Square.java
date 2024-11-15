public class Square implements TwoDimensionalShape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area(){
        return side*side;
    }

    @Override
    public double peremitar() {
        return side*4;
    }
}
