package com.mentorship.shapes;

public class Start {
    public static void main(String[] args) {
        Square square = new Square ();
        square.setSide(5);
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle();
        rectangle.setSide(6);
        rectangle.setSide1(8);
        Triangle triangle = new Triangle();
        triangle.setHigh(5);
        triangle.setSide(9);
        System.out.println("Square area = " + square.calculateArea());
        System.out.println("Circle area = " + circle.calculateArea());
        System.out.println("Rectangle area = " + rectangle.calculateArea());
        System.out.println("Triangle area = " + triangle.calculateArea());
    }
}
