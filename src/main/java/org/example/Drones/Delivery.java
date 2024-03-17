package org.example.Drones;

import java.util.Comparator;
import java.util.Iterator;
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
            makeTrip(drones, locations);
        }
    }

    private static void makeTrip(List<Drone> drones, List<Location> locations) {
        int droneIndex = drones.size() - 1;
        for (Iterator<Location> iterator = locations.iterator(); iterator.hasNext();) {
            Location location = iterator.next();
            droneIndex = deliverToLocation(drones, location, droneIndex);
            if (droneIndex == -1) {
                break;
            }
            if (location.getPackageWeight() == 0) {
                iterator.remove();
            }
        }
    }

    private static int deliverToLocation(List<Drone> drones, Location location, int droneIndex) {
        while (location.getPackageWeight() > 0 && droneIndex >= 0) {
            Drone currentDrone = drones.get(droneIndex);
            if (currentDrone.getMaxWeight() >= location.getPackageWeight()) {
                deliverPackage(location, currentDrone, location.getPackageWeight());
                location.setPackageWeight(0);
            } else {
                deliverPackage(location, currentDrone, currentDrone.getMaxWeight());
                location.setPackageWeight(location.getPackageWeight() - currentDrone.getMaxWeight());
                droneIndex--;
            }
        }
        return droneIndex;
    }

    private static void deliverPackage(Location location, Drone drone, int weight) {
        System.out.println("Delivering " + weight + " to " + location.getName() + " using " + drone.getName());
    }
}
