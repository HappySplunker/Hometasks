package com.mentorship.shapes;

public class Square extends Shape {
    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    double side;
    public double calculateArea(){
        return side*side;
    }
}
