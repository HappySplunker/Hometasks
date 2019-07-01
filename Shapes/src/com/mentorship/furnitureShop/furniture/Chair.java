package com.mentorship.furnitureShop.furniture;

public class Chair extends Furniture implements Putable, Sitable {

    public Chair(int high, int width, String color, int price) {
        super.high = high;
        super.width = width;
        super.color = color;
        super.price = price;
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
