package com.mentorship.shapes;

public abstract class Shape implements Calculable, PrintableToPDF, PrintableToCSV {
    public abstract double calculateArea();
    public abstract void printToPDF();
    public abstract void printToCSV();
}
