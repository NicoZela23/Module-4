package org.example.Drones;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drone> drones = DroneGenerator.generateDrones();
        List<Location> locations = LocationGenerator.generateLocation();
        Delivery delivery = new Delivery();

        delivery.deliveryManager(drones,locations);
    }
}
