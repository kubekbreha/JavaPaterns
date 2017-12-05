package com.paterns;

public class SingleTuke {

    private static final SingleTuke uniqueInstance = new SingleTuke();

    private int data;

    public static SingleTuke getInstance() {
        return uniqueInstance;
    }

    private SingleTuke() { this.data = 0; }

    public int getData() { return this.data; }
    public void setData(int data) { this.data = data; }
}
