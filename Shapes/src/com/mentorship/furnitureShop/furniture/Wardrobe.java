package com.mentorship.furnitureShop.furniture;

import com.mentorship.furnitureShop.Openable;

public class Wardrobe extends Furniture implements Putable, Openable {
    private int high;
    private int width;

    public Wardrobe(int high, int width, String color, int price) {
        this.high = high;
        this.width = width;
        super.color = color;
        super.price = price;
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
    public void open() {
        System.out.println("You have opened wardrobe");
    }

    @Override
    public void close() {
        System.out.println("You have closed wardrobe");
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought wardrobe");
    }

    @Override
    public void putSomething() {
        System.out.println("You have put something in wardrobe");
    }
}
