package com.mentorship.furnitureShop.electricAppliance;


import com.mentorship.furnitureShop.Good;

public abstract class ElectricAppliance extends Good implements Switchable {

    public abstract void buyGood();

    public abstract void switchON();

    public abstract void switchOFF();
}
