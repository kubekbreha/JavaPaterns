package com.paterns;

public class Main {

    public static void main(String[] args) {
        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

        //---------------------------
        SingleTuke tuke = SingleTuke.getInstance();
        tuke.setData(49);
        System.out.println("First ref: " + tuke.getData());

        SingleTuke s2 = SingleTuke.getInstance();
        tuke.setData(9);
        System.out.println("First ref: " + s2.getData());

    }
}
