package Lab3.Prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartmentList;

//    public Building(double maintenanceCost, List<Apartment> apartmentList) {
//        this.maintenanceCost = maintenanceCost;
//        this.apartmentList = apartmentList;
//    }

    public Building(double maintenanceCost, double buildingRent) {
        this.maintenanceCost = maintenanceCost;
        apartmentList = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartmentList.add(apartment);
    }

    public double calculateProfit() {
        double totalRent = 0;
        for (Apartment apartment : apartmentList) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }


}
