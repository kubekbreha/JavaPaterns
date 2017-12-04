package com.patterns;

public class Main {

    public static void main(String[] args) {
        //pass operation add class to parameter
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        //pass operation sub class to parameter
        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        //pass operation mul class to parameter
        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        //pass operation mul class to parameter
        context = new Context(new OperationDiv());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));

        //pass operation pow class to parameter
        context = new Context(new OperationPow());
        System.out.println("10 ^ 5 = " + context.executeStrategy(10, 5));
    }
}
