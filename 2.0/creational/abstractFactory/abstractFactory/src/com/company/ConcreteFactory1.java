package com.company;

public class ConcreteFactory1 extends AbstractFactory{

    @Override
    AbstractProductA getProduct1() {
        return new Princezna();
    }

    @Override
    AbstractProductB getProduct2() {
        return new Drak();
    }
}
