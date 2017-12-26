package com.company;

public class WithSprinkles extends CoffeeDecorator {

    public WithSprinkles(Coffee c) {
        super(c);
    }

    public double getCost(){
        return super.getCost() + 0.2;
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + ", Sprinkles";
    }
}
