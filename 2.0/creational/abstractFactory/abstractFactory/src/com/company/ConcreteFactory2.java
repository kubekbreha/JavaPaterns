package com.company;

public class ConcreteFactory2 extends AbstractFactory{

    public void createProductB(){

    }

    @Override
    AbstractProductA getProduct1() {
        return new CervenaCiapocka();
    }

    @Override
    AbstractProductB getProduct2() {
        return new Vlk();
    }
}
