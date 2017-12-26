package com.company;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component componenet) {
        super(componenet);
    }

    @Override
    public String Action(){
        return super.Action() + ", SHOOT";
    }
}
