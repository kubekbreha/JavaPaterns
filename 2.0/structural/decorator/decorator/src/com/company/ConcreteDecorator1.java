package com.company;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component componenet) {
        super(componenet);
    }

    @Override
    public String Action(){
        return super.Action() + ", BUY AND SELL";
    }
}
