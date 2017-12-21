package com.patterns;

public class OperationAdd implements Strategy {

    //override function from interface
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
