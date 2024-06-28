package Lab3.Prob4;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		//Object[] objects = { new House(9000), new Condo(2), new Trailer() };

//		double totalRent = Admin.computeTotalRent(objects);
//		System.out.println(totalRent);

		List<Property> propertyList = new ArrayList<>();
		Address hourseAddress = new Address("123 Main St", "Fairfield", "IA", "52556");
		Address condoAddress = new Address("456 Elm St", "Fairfield", "IA", "52556");
		Address trailerAddress = new Address("789 Maple St", "Chicago", "IA", "52556");
		propertyList.add(new House(100, hourseAddress));
		propertyList.add(new Condo(condoAddress, 3));
		propertyList.add(new Trailer(trailerAddress));

		Admin admin = new Admin();
		double totalRent =  admin.computeTotalRentInSystem(propertyList);
		System.out.println(totalRent);

		Object[] propertyArray = propertyList.toArray();
		double totalRent2 = Admin.computeTotalRent(propertyArray);
		System.out.println(totalRent2);

		System.out.println("Properties in Fairfield:");
		admin.listPropertiesInCity(propertyList, "Fairfield");

	}
}
