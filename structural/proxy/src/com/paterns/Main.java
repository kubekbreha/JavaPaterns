package com.paterns;

public class Main {

    public static void main(String[] args) {
	    Image image = new ProxyImage("rest.jpg");

	    image.display();

        System.out.println();
        image.display();
    }
}
