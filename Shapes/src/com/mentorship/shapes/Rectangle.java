package com.mentorship.shapes;

public class Rectangle extends Square {
    private double side;
    private double side1;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public double calculateArea() {
        return side * side1;
    }

    @Override
    public void printToPDF(){
        System.out.println("I am rectangle");
    }

    @Override
    public void printToCSV() {
        System.out.println("I am rectangle in CSV");
    }
}
