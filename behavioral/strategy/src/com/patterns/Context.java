package com.patterns;

public class Context {

    //crate object of Strategy interface
    private Strategy strategy;

    //create constructor
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //create function which will behave on demand of strategy class
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
