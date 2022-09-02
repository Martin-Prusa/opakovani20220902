package cz.martin;

import cz.martin.buildings.Building;
import cz.martin.buildings.BuildingsService;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BuildingsService buildingsService = new BuildingsService();

        System.out.println("-------Part-2--------");
        for (Building b : buildingsService.getBuildingsInCity("Las Vegas")) {
            System.out.println(b.getBuilding() + "("+b.getCity()+")"+" - "+b.getArchitect());
        }

        System.out.println("-------Part-3---------");
        HashMap<String, ArrayList<Building>> buildingsByCity = buildingsService.getBuildingsByCity();
        for (String key : buildingsByCity.keySet()) {
            System.out.println(key+":");
            for (Building building : buildingsByCity.get(key)) {
                System.out.println("\t "+building.getBuilding());
            }
        }

        System.out.println("-------Part-4---------");
        System.out.println(buildingsService.getAverage());
    }
}
