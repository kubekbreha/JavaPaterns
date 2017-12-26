package com.company;

public class Decorator implements Component {

    private Component componenet;

    public Decorator(Component componenet){
        this.componenet = componenet;
    }


    @Override
    public String Action() {
        return componenet.Action();
    }
}
