package com.paterns;

public class Main {

    public static void main(String[] args) {

        User robert = new User("Robert");
        User peter = new User("Peter");

        robert.sendMessage("hi");
        peter.sendMessage("hello");

    }
}
