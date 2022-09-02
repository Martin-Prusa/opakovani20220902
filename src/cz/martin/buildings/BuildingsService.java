package cz.martin.buildings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BuildingsService {
    private List<Building> buildings;

    private HashMap<String, ArrayList<Building>> buildingsByCity = new HashMap<>();

    private double average;

    public BuildingsService() {
        this.buildings = new BuildingsRepository().getBuildings();

        for (Building building : this.buildings) {
            buildingsByCity.putIfAbsent(building.getState(), new ArrayList<>());
            buildingsByCity.get(building.getState()).add(building);
        }

        this.average = buildings.stream().map(i -> i.getCosts()).mapToLong(i -> i.longValue()).average().getAsDouble();
    }

    public List<Building> getBuildingsInCity(String city) {
        return this.buildings.stream().filter(i -> i.getCity().equalsIgnoreCase(city)).toList();
    }

    public HashMap<String, ArrayList<Building>> getBuildingsByCity() {
        return buildingsByCity;
    }

    public double getAverage() {
        return average;
    }
}
