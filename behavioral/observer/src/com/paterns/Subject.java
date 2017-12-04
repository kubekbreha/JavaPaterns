package com.paterns;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //list which holds all observers
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    //get value with bin, octa and hexa update function works
    public int getState() {
        return state;
    }

    //called in main and automatically calls all observers in list an their update functions
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    //iterate trough list and call update function
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
