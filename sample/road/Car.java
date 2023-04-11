package sample.road;

import sample.auto.Vehicle;

public class Car extends Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    
    public void stop() {
        System.out.println("Car stopped");
    }
}
