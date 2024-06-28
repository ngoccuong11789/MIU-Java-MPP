package Lab3.Prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private List<Building> buildingList;

//    public Landlord(List<Building> buildingList) {
//        this.buildingList = buildingList;
//    }
    public Landlord() {
        buildingList = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildingList.add(building);
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (Building building : buildingList) {
            totalProfit += building.calculateProfit();
        }

        return totalProfit;
    }
}
