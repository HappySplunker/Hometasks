package com.mentorship.shapes;

public class Square extends Rectangle {
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;
    public double calculateArea(){
        return side*side;
    }
}
