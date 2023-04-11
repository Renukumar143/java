package sample.road;

import sample.auto.Vehicle;

public class Bus extends Vehicle {
    public void start() {
        System.out.println("Bus started");
    }
    
    public void stop() {
        System.out.println("Bus stopped");
    }
}