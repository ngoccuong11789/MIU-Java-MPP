package Lab7.Prob2;

public final class Rectangle  implements ClosedCurve, Polygon {
	final private double width;
	final private double length;
	
	@Override
	public double computePerimeter() {
//		double area =  width * length;
//		return area;
		return Polygon.super.computePerimeter();
	}

	@Override
	public double[] getSides() {
		return new double[]{width, length, width, length};
	}
	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}


}
