package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractProductA daco = new ConcreteFactory1().getProduct1();
        AbstractProductB daco2 = new ConcreteFactory1().getProduct2();
        daco.rozpravaj();
        daco2.rozpravaj();

        AbstractProductA dac = new ConcreteFactory2().getProduct1();
        AbstractProductB dac2 = new ConcreteFactory2().getProduct2();
        dac.rozpravaj();
        dac2.rozpravaj();

    }
}
