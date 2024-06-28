package Lab3.Prob3.A;

public class Cylinder extends Circle{
    private double height;
    //private double radius;

    public Cylinder (double radius, double height) {
       super(radius);
       this.height = height;
       //this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return computeArea() * height;
    }

}
