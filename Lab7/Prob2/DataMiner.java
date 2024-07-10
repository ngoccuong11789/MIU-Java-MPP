package Lab7.Prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5,7));
		dm.objects.add(new Rectangle(2,9));
		dm.objects.add(new Circle(6));
		System.out.println(dm.computeAveragePerimeter());

		List<Object> objects = Arrays.asList(
				new Rectangle(3, 4),
				new Circle(5),
				new Rectangle(2, 3),
				new EquilateralTriangle(3),
				new Ellipse(5, 1.5)
		);

		double averagePerimeter = computeAveragePerimeter(objects);
		System.out.println("Average Perimeter :" + averagePerimeter);

	}

	public static double computeAveragePerimeter(List<Object> objects) {
		double totalPerimeter = 0;
		int count = 0;
		for (Object object : objects) {
			if (object instanceof ClosedCurve) {
				ClosedCurve closedCurve = (ClosedCurve) object;
				totalPerimeter += closedCurve.computePerimeter();
			} else if (object instanceof Polygon) {
				Polygon polygon = (Polygon) object;
				totalPerimeter += polygon.computePerimeter();
			}
			count++;
		}
		return (count == 0) ? 0 : totalPerimeter / count;
	}
	
	//OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum/objects.size();
	}

}
