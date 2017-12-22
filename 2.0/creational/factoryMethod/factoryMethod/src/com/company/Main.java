package com.company;

public class Main {

    public static void main(String[] args) {
        Factory factory;
        Product carFactory= new CarFactory("lambo");
        factory = carFactory.getFactoryProduct();
        factory.displayProduct();
    }
}
