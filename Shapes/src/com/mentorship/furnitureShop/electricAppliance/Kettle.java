package com.mentorship.furnitureShop.electricAppliance;

public class Kettle extends ElectricAppliance implements Heatable {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public Kettle(int capacity, String color, int price) {
        this.capacity = capacity;
        super.color = color;
        super.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought kettle");
    }

    @Override
    public void switchON() {
        System.out.println("Kettle was switched ON");
    }

    @Override
    public void switchOFF() {
        System.out.println("Kettle was switched ON");
    }

    @Override
    public void heat() {
        System.out.println("Kettle is heating");
    }
}
