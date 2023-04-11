package sample;

import sample.auto.Vehicle;
import sample.road.Car;
import sample.road.Bus;
import sample.road.Bike;

public class VehicleFactory {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle bike = new Bike();
        
        bus.start();
        bike.start();
        
        car.stop();
        bus.stop();
        bike.stop();
    }
}
