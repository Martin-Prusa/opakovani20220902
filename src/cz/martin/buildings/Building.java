package cz.martin.buildings;

public class Building {
    private String building;
    private String city;
    private String architect;
    private String state;
    private long costs;

    public Building(String building, String city, String architect, String state, long costs) {
        this.building = building;
        this.city = city;
        this.architect = architect;
        this.state = state;
        this.costs = costs;
    }

    public String getBuilding() {
        return building;
    }

    public String getCity() {
        return city;
    }

    public String getArchitect() {
        return architect;
    }

    public String getState() {
        return state;
    }

    public long getCosts() {
        return costs;
    }
}
