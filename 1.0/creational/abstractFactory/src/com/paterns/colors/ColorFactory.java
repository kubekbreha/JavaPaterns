package com.paterns.colors;

import com.paterns.AbstractFactory;
import com.paterns.vehicles.Vehicle;

public class ColorFactory implements AbstractFactory{

    @Override
    public Color getColor(String color) {

        if(color==null) return null;

        if(color.equalsIgnoreCase("YELLOW")){
            return new Yellow();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("RED")){
            return new Red();
        }

        return null;
    }

    @Override
    public Vehicle getVehicle(String vehicle) {
        return null;
    }
}
