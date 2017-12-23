package com.company;

public class Singleton {
    public static volatile Singleton instance;

    private Singleton() {
        System.out.println("singleton");
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
