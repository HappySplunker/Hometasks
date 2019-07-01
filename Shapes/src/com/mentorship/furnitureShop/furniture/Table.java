package com.mentorship.furnitureShop.furniture;

public class Table extends Furniture implements Putable {

    public Table(int high, int width, String color, int price) {
        super.high = high;
        super.width = width;
        super.color = color;
        super.price = price;
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
