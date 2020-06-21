package org.example_typygeneryczne.zad_1;

public class BoxForShapes<T extends Shape> {

    T[] array;

    int getSumOfAllPerimeters(T[] array) {
        int wynik= 0;
        for(T t : array) {
            wynik += t.getPerimeter();
        }
        return wynik;
    }

}
