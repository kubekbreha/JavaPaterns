package com.company;

public class ConcreteBuilderSedliak implements Builder {

    private Product product;

    public ConcreteBuilderSedliak(){
        this.product = new Product();
    }


    @Override
    public void dress() {
        product.setOblecenie("tricko");
    }

    @Override
    public void equip() {
        product.setZbran("motyka");
    }

    @Override
    public void teachBehavior() {
        product.setSpravanie("utekaj");
    }

    @Override
    public Product getCharacter() {
        return this.product;
    }
}
