package com.mentorship.furnitureShop.furniture;

public class Bed extends Furniture implements Putable, Layable, Sitable {
    private int high;
    private int wight;

    public int getHigh() {
        return high;
    }

    public Bed(int high, int wight, String color, int price) {
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
        System.out.println("You have bought bed");
    }

    @Override
    public void layOn() {
        System.out.println("You have laid on bed");
    }

    @Override
    public void putSomething() {
        System.out.println("You have put something on bed");
    }

    @Override
    public void sitOn() {
        System.out.println("You have sited on bed");
    }
}
