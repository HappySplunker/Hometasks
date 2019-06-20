package com.mentorship.shapes;

public class Triangle extends Square {

    private double side1;
    private double side2;
    private double high;

    public Triangle(double side, double side1, double side2, double high) {
        super(side);
        this.side1 = side1;
        this.side2 = side2;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return (side1*high)/2;
    }

}
