package Lab7.Prob2;

public interface Polygon {
    double[] getSides();

    default double computePerimeter() {
        double[] sides = getSides();
        double perimeter = 0;
        for(double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
