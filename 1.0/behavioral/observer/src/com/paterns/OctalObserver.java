package com.paterns;

public class OctalObserver extends Observer{

    //create constructor and add subject to observers list in Subject class
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    //update function which is called in notify function
    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}