package com.company;

public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricked INITIALIZED");
    }

    @Override
    void startPlay() {
        System.out.println("Cricked PLAY");
    }

    @Override
    void endPlay() {
        System.out.println("Cricked END");
    }
}
