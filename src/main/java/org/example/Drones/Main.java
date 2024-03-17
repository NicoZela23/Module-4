package org.example.Drones;

public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery();
        delivery.deliveryManager(DroneGenerator.generateDrones(),LocationGenerator.generateLocation());
    }
}
