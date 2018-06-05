package com.paterns;

public class HexaObserver extends Observer{

    //create constructor and add subject to observers list in Subject class
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    //update function which is called in notify function
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}