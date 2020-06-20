package org.example4;

public class App {
    public static void main(String[] args) {
        Postac mag = new Mag();
        System.out.println("zadałeś uderzenie o wartości " + mag.uderz());
        mag.smier();
        mag.walcz();

        Postac wojownik = new Wojownik();
        ZywyObiekt zywyObiekt = new Mag();
        zywyObiekt.smier();
        Postac zywobiekt2 = (Postac)zywyObiekt;
        zywobiekt2.method2();
        System.out.println(Postac.LOKACJA_STARTOWA);
        System.out.println("zadałeś uderzenie o wartości " + wojownik.uderz());
    }
}
