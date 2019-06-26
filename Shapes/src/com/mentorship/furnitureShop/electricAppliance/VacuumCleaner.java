package com.mentorship.furnitureShop.electricAppliance;

public class VacuumCleaner extends ElectricAppliance {
    private int weight;

    public VacuumCleaner(int weight, String color, int price) {
        this.weight = weight;
        super.color = color;
        super.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public void buyGood() {
        System.out.println("You have bought vacuum cleaner");
    }

    @Override
    public void switchON() {
        System.out.println("Vacuum cleaner was switched ON");
    }

    @Override
    public void switchOFF() {
        System.out.println("Vacuum cleaner was switched OFF");
    }
}
