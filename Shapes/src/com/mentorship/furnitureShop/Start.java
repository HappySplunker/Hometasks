package com.mentorship.furnitureShop;

import com.mentorship.furnitureShop.electricAppliance.Iron;
import com.mentorship.furnitureShop.furniture.Bed;
import com.mentorship.furnitureShop.furniture.Chair;
import com.mentorship.furnitureShop.furniture.Furniture;
import com.mentorship.furnitureShop.furniture.Wardrobe;

public class Start {
    public static void main(String[] args) {
        Good wardrobe = new Wardrobe(204, 160, "brown", 340);
        ((Wardrobe) wardrobe).putSomething();
        Furniture chair = new Chair(60, 67, "white", 56 );
        ((Chair) chair).sitOn();
        Iron iron = new Iron(340, "grey", 34);
        iron.buyGood();
        Bed bed = new Bed(210,200,"white", 430);
        bed.buyGood();
    }
}
