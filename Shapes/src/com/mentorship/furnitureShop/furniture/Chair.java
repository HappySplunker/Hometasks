package com.mentorship.furnitureShop.furniture;

public class Chair extends Furniture implements Putable, Sitable {
    private int high;

    public int getHigh() {
        return high;
    }

    public Chair(int high, String color, int price) {
        this.high = high;
        super.color = color;
        super.price = price;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought chair");
    }

    @Override
    public void putSomething() {
        System.out.println("You have put something on chair");
    }

    @Override
    public void sitOn() {
        System.out.println("You have sited on chair");
    }
}
