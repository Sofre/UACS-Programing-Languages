public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area(){
        return radius*radius*Math.PI;
    }

    public double perimeter(){
        return 2* radius*Math.PI;
    }
}
