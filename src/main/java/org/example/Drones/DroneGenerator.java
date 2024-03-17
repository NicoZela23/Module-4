package org.example.Drones;

import java.util.ArrayList;
import java.util.List;

public class DroneGenerator {
    public static List<Drone> generateDrones(){
        List<Drone> droneSquad = new ArrayList<>();
        droneSquad.add(new Drone("Drone 1", 12));
        droneSquad.add(new Drone("Drone 2", 42));
        droneSquad.add(new Drone("Drone 3", 23));
        droneSquad.add(new Drone("Drone 4", 24));
        droneSquad.add(new Drone("Drone 5", 20));
        return droneSquad;
    }
}
