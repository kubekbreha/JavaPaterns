package com.paterns;

public class Main {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for(int i = 0 ; i< 20; i++){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRAndomX());
            circle.setY(getRAndomY());
            circle.setRadius(100);
            circle.draw();
        }

    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    public static int getRAndomX(){
        return (int)(Math.random()*100);
    }

    public static int getRAndomY(){
        return (int)(Math.random()*100);
    }




}
