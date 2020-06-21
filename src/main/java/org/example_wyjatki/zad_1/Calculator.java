package org.example_wyjatki.zad_1;

public class Calculator {
    /*
    Napisz klase Calculator - ktora bedzie posiadala metode divide(int a, int b).
    Niech ta metoda zwraca wynik dzielenia a przez b.
    Utworz checked Exception - DivideByZeroException
    spraw aby w sytuacji w ktorej programista poda w parametrze int b wartosc 0 doszlo do wyrzucenia naszego wyjatku.
     */

    double divide(int a, int b) throws DivideByZeroException {
        if(b == 0) {
            throw new DivideByZeroException("nie dzieli sie przez zero");
        } else {
            return a/b;
        }
    }
}
