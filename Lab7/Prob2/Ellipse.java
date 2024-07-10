package Lab7.Prob2;

public class Ellipse implements ClosedCurve {
    double semiMajorAxis;
    double ellipticIntegral;

    public Ellipse(double semiMajorAxis, double ellipticIntegral) {
        this.semiMajorAxis = semiMajorAxis;
        this.ellipticIntegral = ellipticIntegral;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiMajorAxis * ellipticIntegral;
    }

}
