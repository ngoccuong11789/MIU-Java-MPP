package Lab3.Prob3.B;

public class Cylinder{
    private double height;
    //private double radius;
    private Circle circle;

    public Cylinder (double radius, double height) {
       //super(radius);
       this.height = height;
       this.circle = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return circle.computeArea() * height;
    }

    public double getRadius() {
        return circle.getRadius();
    }

    public double computeCircleArea() {
        return circle.computeArea();
    }

}
