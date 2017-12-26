package com.company;

public class Main {

    public static void main(String[] args) {
        Coffee c = new SimpleCoffe();

        c = new WithMilk(c);
        c = new WithMilk(c);
        printInfo(c);
    }

    public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }
}
