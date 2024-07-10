package Lab7.Prob2;

public class EquilateralTriangle implements ClosedCurve, Polygon{

    double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double computePerimeter() {
        return Polygon.super.computePerimeter();
    }

    @Override
    public double[] getSides() {
        return new double[] {side, side, side};
    }

}
