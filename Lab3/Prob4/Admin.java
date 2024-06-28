package Lab3.Prob4;

import java.util.List;

public class Admin {
	public static double computeTotalRent(Object[] properties) {
		double totalRent = 0;
		for (Object o : properties) {
			if (o instanceof House) {
				House h = (House) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Condo) {
				Condo h = (Condo) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer h = (Trailer) o;
				totalRent += h.computeRent();
			}	
		}
		return totalRent;
	}

	public double computeTotalRentInSystem(List<Property> propertyList) {
		double totalRent = 0;
		for(Property property: propertyList) {
			totalRent += property.computeRent();
		}
		return totalRent;
	}

	public void listPropertiesInCity(List<Property> properties, String city) {
		for (Property property: properties) {
			Address address = null;
			if (property instanceof House) {
				House h = (House) property;
				address = h.getAddress();
			} else if (property instanceof Condo) {
				Condo h = (Condo) property;
				address = h.getAddress();
			} else if (property instanceof Trailer) {
				Trailer h = (Trailer) property;
				address = h.getTrailerParkAddress();
			}
			if (address != null && address.getCity().equals(city)) {
				System.out.println("Street:" + address.getStreet() + " City:" + address.getCity() );
			}
		}
	}

}
