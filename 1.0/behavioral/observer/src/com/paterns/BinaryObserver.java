package com.paterns;

public class BinaryObserver extends Observer{

    //create constructor and add subject to observers list in Subject class
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    //update function which is called in notify function
    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
