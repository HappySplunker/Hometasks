package com.mentorship.shapes;

public class Start {
    public static void main(String[] args) {

        System.out.println("\n===========\n");


        Shape circle1 = new Circle(12);
        Shape triangle1 = new Triangle();
        Calculable circleCal = new Circle(7);
        System.out.println(circleCal.calculateArea());

        PrintableToPDF triangle2 = new Triangle();
        triangle2.printToPDF();
        PrintableToCSV rectangle2 = new Rectangle();
        rectangle2.printToCSV();
    }
}
