package com.mentorship.furnitureShop.furniture;

public class Bed extends Furniture implements Putable, Layable, Sitable {

    public Bed(int high, int width, String color, int price) {
        super.high = high;
        super.width = width;
        super.color = color;
        super.price = price;
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought bed colored " + color + " size: " + high + "X" + width + " for " + price);
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
