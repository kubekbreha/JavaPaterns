package com.company;

public class Main {

    public static void main(String[] args) {

        Builder sedliak = new ConcreteBuilderBojovnik();
        Director der = new Director(sedliak);

        der.createCharacter();

        Product sed = der.getProduct();
        System.out.println(sed.toString());

    }
}
