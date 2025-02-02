package Lab5.Prob3;

public class Triangle implements Shape{

    private final double base;
    private final double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (base * height)/2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
