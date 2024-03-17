package org.example.Drones;

public class Location {
    private String name;
    private int packageWeight;

    public Location(String name, int packageWeight) {
        this.name = name;
        this.packageWeight = packageWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(int packageWeight) {
        this.packageWeight = packageWeight;
    }
}
