package com.company;

public class SimpleCoffe implements Coffee {

    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
