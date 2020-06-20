package org.example;


public class App {
    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze("Mysz", 4);
        Zwierze zwierze1 = new Zwierze("Mysz", 4);
        System.out.println(zwierze);
        System.out.println(zwierze.getNazwa());
        System.out.println(zwierze.equals(zwierze1));


        Tygrys tygrys = new Tygrys("Tygrys", 4, 200);
        Tygrys tygrys1 = new Tygrys();
        Tygrys tygrys2 = new Tygrys("Tygrys", 4, 200);

        Zwierze tygerKing = new Tygrys("King", 4, 600);


    }
}
