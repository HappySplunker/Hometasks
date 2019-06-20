package com.mentorship.shapes;

public class Triangle extends Shape {
    public Triangle(int side1, int high) {
        this.side1 = side1;
        this.high = high;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    private int side1;
    private int high;


    @Override
    public double calculateArea() {
        return (side1*high)/2;
    }

}
