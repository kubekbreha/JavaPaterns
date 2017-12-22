package com.company;

public class CarFactory implements Product{

    private Factory product;

    public CarFactory(String productName){
        product = new Factory(productName);
    }


    @Override
    public Factory getFactoryProduct() {
        return product;
    }
}
