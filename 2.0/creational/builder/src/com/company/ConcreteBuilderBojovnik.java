package com.company;

public class ConcreteBuilderBojovnik implements Builder {

    private Product product;


    public ConcreteBuilderBojovnik(){
        this.product = new Product();
    }

    @Override
    public void dress() {
        product.setOblecenie("kruzkova kosela");
    }

    @Override
    public void equip() {
        product.setZbran("mec");
    }

    @Override
    public void teachBehavior() {
        product.setSpravanie("bojuj");
    }

    @Override
    public Product getCharacter() {
        return this.product;
    }
}
