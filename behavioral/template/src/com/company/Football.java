package com.company;

public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football INITIALIZED");
    }

    @Override
    void startPlay() {
        System.out.println("Football PLAY");
    }

    @Override
    void endPlay() {
        System.out.println("Football END");
    }
}
