package com.mentorship.furnitureShop;

public abstract class Good implements Buyable {
    public int price;
    public String color;
    public abstract void buyGood();
}
