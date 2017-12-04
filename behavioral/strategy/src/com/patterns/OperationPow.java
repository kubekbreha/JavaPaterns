package com.patterns;

public class OperationPow implements Strategy {

    //override function from interface
    @Override
    public int doOperation(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
}
