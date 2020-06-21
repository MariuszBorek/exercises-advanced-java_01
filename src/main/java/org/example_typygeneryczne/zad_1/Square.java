package org.example_typygeneryczne.zad_1;

public class Square implements Shape {

    private double length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
