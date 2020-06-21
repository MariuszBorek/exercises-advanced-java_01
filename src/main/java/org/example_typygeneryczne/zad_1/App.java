package org.example_typygeneryczne.zad_1;

public class App {
    /*
    Stworz klase BoxForShapes, niech pozwala ona na podanie typu
    generycznego rozszerzajacego interfejs Shape
    niech przechowuje ona tablice typu T z ksztaltami
    Interfejs Shape niech posiada metode obliczajaca obwod (circuit)
    Stworz 2 klasy implementujace interfejs Shape - Square i Circle
    Niech BoxForShapes posiada metode obliczajaca sume
    obowodow wszystkich ksztaltow
    w main stworzcie 3 tablice - jedna typu Shape
    Jedna typu Square i jedna typu Circle wypelnijcie je 2-3 przykladami
    stworzcie osobne pudelka na typ Shape, typ Square i typ Circle
    wyswietlcie sumy obwodow w konsoli
     */

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3);
        shape[1] = new Square(6);
        shape[2] = new Circle(9);

        Circle[] circle = new Circle[3];
        circle[0] = new Circle(12);
        circle[0] = new Circle(14);
        circle[0] = new Circle(18);

        Square[] square = new Square[3];
        square[0] = new Square(54);
        square[0] = new Square(23);
        square[0] = new Square(15);

        BoxForShapes<Shape> boxForShapes = new BoxForShapes();
        boxForShapes.getSumOfAllPerimeters(shape);




    }
}
