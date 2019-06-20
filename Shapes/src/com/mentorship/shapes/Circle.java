package com.mentorship.shapes;

public class Circle extends Shape {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;
    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }
}
