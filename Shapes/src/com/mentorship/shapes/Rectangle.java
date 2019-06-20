package com.mentorship.shapes;

public class Rectangle extends Shape {
    private double high;
    private double width;

    public Rectangle() {
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double high, double width) {
        this.high = high;
        this.width = width;
    }

    @Override
   public double calculateArea() {
        return high*width;
    }
}
