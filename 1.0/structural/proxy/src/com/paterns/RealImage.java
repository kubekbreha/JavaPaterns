package com.paterns;

public class RealImage implements Image {

    private String filename;

    public RealImage(String fileName) {
        this.filename = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying -> " + filename);
    }

    private void loadFromDisk(String filename){
        System.out.println("Loading -> " + filename);
    }

}
