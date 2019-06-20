package com.mentorship.shapes;

public class Start {
    public static void main(String[] args) {
        Square square = new Square (5);
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(6, 11);
        Triangle triangle = new Triangle(4, 8, 2, 4);
        System.out.println("Square area = " + square.calculateArea());
        System.out.println("Circle area = " + circle.calculateArea());
        System.out.println("Rectangle area = " + rectangle.calculateArea());
        System.out.println("Triangle area = " + triangle.calculateArea());
    }
}
