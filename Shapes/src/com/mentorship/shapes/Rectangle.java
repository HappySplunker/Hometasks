package com.mentorship.shapes;

public class Rectangle extends Square {
    private double side1;




    public Rectangle(double side, double side1) {
        super(side);
        this.side1 = side1;

    }

    @Override
   public double calculateArea() {
        return side*side1;
    }
}
