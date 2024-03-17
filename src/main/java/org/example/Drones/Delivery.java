package org.example.Drones;

import java.util.Comparator;
import java.util.List;

public class Delivery implements IDelivery{
    @Override
    public void deliveryManager(List<Drone> drones, List<Location> locations) {
        drones.sort(Comparator.comparingInt(Drone::getMaxWeight));
        locations.sort(Comparator.comparingInt(Location::getPackageWeight));

        int trips = 0;
        while (!locations.isEmpty()) {
            trips++;
            System.out.println("Trip " + trips + ":");
            AvailableTrips.makeTrip(drones, locations);
        }
    }
}
