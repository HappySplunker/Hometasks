package com.mentorship.furnitureShop.furniture;

import com.mentorship.furnitureShop.Openable;

public class Wardrobe extends Furniture implements Putable, Openable {

    public Wardrobe(int high, int width, String color, int price) {
        super.high = high;
        super.width = width;
        super.color = color;
        super.price = price;
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
