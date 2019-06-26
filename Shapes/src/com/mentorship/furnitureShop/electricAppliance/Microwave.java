package com.mentorship.furnitureShop.electricAppliance;

import com.mentorship.furnitureShop.Openable;

public class Microwave extends ElectricAppliance implements Openable, Heatable {
    private int high;
    private int width;

    public Microwave(int high, int width, String color, int price) {
        this.high = high;
        this.width = width;
        super.color = color;
        super.price=price;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void open() {
        System.out.println("You have opened microwave");
    }

    @Override
    public void close() {
        System.out.println("You have closed microwave");
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought microwave");
    }

    @Override
    public void switchON() {
        System.out.println("Microwave was switched ON");
    }

    @Override
    public void switchOFF() {
        System.out.println("Microwave was switched OFF");
    }

    @Override
    public void heat() {
        System.out.println("Microwave is heating");
    }
}
