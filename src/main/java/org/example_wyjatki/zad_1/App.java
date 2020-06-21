package org.example_wyjatki.zad_1;

public class App {
    /*
    Napisz klase Calculator - ktora bedzie posiadala metode divide(int a, int b).
    Niech ta metoda zwraca wynik dzielenia a przez b.
    Utworz checked Exception - DivideByZeroException
    spraw aby w sytuacji w ktorej programista poda w parametrze int b wartosc 0 doszlo do wyrzucenia naszego wyjatku.
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double score = 0;
        try {
            score = calculator.divide(23,0);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(score);
    }
}
