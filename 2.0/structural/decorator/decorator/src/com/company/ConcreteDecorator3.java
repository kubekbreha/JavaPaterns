package com.company;

public class ConcreteDecorator3 extends Decorator {
    public ConcreteDecorator3(Component componenet) {
        super(componenet);
    }

    @Override
    public String Action(){
        return super.Action() + ", CALL";
    }
}
