package com.mentorship.shapes;

public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    @Override
    public void printToPDF() {
        System.out.println("I am square");
    }

    @Override
    public void printToCSV() {
        System.out.println("I am square in CSV");
    }
}
