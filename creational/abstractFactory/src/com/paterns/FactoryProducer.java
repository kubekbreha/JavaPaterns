package com.paterns;

import com.paterns.colors.ColorFactory;
import com.paterns.vehicles.VehicleFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("VEHICLE")){
            return new VehicleFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }

}
