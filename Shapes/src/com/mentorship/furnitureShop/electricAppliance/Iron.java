package com.mentorship.furnitureShop.electricAppliance;

public class Iron extends ElectricAppliance implements Heatable {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Iron(int weight, String color, int price) {
        this.weight = weight;
        super.color = color;
        super.price = price;
    }

    @Override
    public void buyGood() {
        System.out.println("You have bought iron");
    }

    @Override
    public void switchON() {
        System.out.println("Iron was switched ON");
    }

    @Override
    public void switchOFF() {
        System.out.println("Iron was switched OFF");
    }

    @Override
    public void heat() {
        System.out.println("Iron is heating");
    }
}
