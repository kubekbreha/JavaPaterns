package com.paterns.vehicles;

import com.paterns.AbstractFactory;
import com.paterns.colors.Color;

public class VehicleFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Vehicle getVehicle(String vehicle) {
        if(vehicle==null) return null;

        if(vehicle.equalsIgnoreCase("CAR")){
            return new Car();

        }else if(vehicle.equalsIgnoreCase("BUS")){
            return new Bus();

        }else if(vehicle.equalsIgnoreCase("BIKE")){
            return new Bike();
        }

        return null;
    }
}
