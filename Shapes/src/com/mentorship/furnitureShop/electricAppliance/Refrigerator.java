package com.mentorship.furnitureShop.electricAppliance;

import com.mentorship.furnitureShop.Openable;

public class Refrigerator extends ElectricAppliance implements Openable {
    private int high;
    private int width;

    public Refrigerator(int high, int width, String color, int price) {
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


    @Override
    public void buyGood() {
        System.out.println("You have bought refrigerator");
    }

    @Override
    public void switchON() {
        System.out.println("Refrigerator was switched ON");
    }

    @Override
    public void switchOFF() {
        System.out.println("Refrigerator was switched OFF");
    }

    @Override
    public void open() {
        System.out.println("You have opened refrigerator");
    }

    @Override
    public void close() {
        System.out.println("You have closed refrigerator");
    }
}
