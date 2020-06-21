package org.example_wyjatki.example_2;

public class App {
    public static void main(String[] args) {
        Operacja operacja = new Operacja();

        try {
            operacja.operuj();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("Kauteryzajca");
        } finally {
            System.out.println("operacja zakońcona");
        }

        System.out.println("to tez się wykona");

    }
}
