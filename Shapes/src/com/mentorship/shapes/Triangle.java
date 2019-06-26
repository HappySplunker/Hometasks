package com.mentorship.shapes;

public class Triangle extends Shape {
    private double side;
    private double side1;
    private double side2;
    private double high;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return (side * high) / 2;
    }

    @Override
    public void printToPDF() {
        System.out.println("I am triangle");
    }

    @Override
    public void printToCSV() {
        System.out.println("I am triangle in CSV");
    }

}
