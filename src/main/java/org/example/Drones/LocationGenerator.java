package org.example.Drones;

import java.util.ArrayList;
import java.util.List;

public class LocationGenerator {
    public static List<Location> generateLocation(){
        List<Location> tripDeliveries = new ArrayList<>();
        tripDeliveries.add(new Location("Location 1", 40));
        tripDeliveries.add(new Location("Location 2", 60));
        tripDeliveries.add(new Location("Location 3", 20));
        tripDeliveries.add(new Location("Location 4", 100));
        tripDeliveries.add(new Location("Location 5", 50));
        tripDeliveries.add(new Location("Location 6", 12));
        tripDeliveries.add(new Location("Location 7", 24));
        tripDeliveries.add(new Location("Location 8", 56));
        tripDeliveries.add(new Location("Location 9", 17));
        return tripDeliveries;
    }
}
