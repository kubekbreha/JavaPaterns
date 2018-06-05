package com.paterns;

import com.paterns.colors.Color;
import com.paterns.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("VEHICLE");

        //get an object of Shape Circle
        Vehicle vh1 = shapeFactory.getVehicle("CAR");

        //call draw method of Shape Circle
        vh1.Ride();

        //get an object of Shape Rectangle
        Vehicle vh2 = shapeFactory.getVehicle("BUS");

        //call draw method of Shape Rectangle
        vh2.Ride();

        //get an object of Shape Square
        Vehicle vh3 = shapeFactory.getVehicle("BIKE");

        //call draw method of Shape Square
        vh3.Ride();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("YELLOW");

        //call fill method of Color Blue
        color3.fill();

    }
}
