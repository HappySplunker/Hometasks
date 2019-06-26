package com.mentorship.furnitureShop.furniture;

public class Table extends Furniture implements Putable {
    private int high;
    private int wight;

    public int getHigh() {
        return high;
    }

    public Table(int high, int wight, String color, int price) {
        this.high = high;
        this.wight = wight;
        super.color = color;
        super.price = price;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought table");
    }

    @Override
    public void putSomething() {
        System.out.println("You have put something on table");
    }
}
