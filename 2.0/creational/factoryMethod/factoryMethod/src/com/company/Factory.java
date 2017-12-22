package com.company;

public class Factory {

    private String product;

    public Factory(String product){
        this.product = product;
    }

    public void displayProduct(){
        System.out.println("This is product -> " + product);
    }

}
