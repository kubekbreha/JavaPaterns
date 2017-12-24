package com.company;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product getProduct(){
        return this.builder.getCharacter();
    }

    public void createCharacter(){
        builder.dress();
        builder.equip();
        builder.teachBehavior();
    }

}
