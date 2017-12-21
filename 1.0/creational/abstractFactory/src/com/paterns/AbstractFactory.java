package com.paterns;

import com.paterns.colors.Color;
import com.paterns.vehicles.Vehicle;

public interface AbstractFactory {
    abstract Color getColor(String color);
    abstract Vehicle getVehicle(String vehicle);

}
