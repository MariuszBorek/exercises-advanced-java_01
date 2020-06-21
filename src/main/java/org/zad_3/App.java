package org.zad_3;

public class App {
    public static void main(String[] args) {

        Samolot samolot = new Samolot() {
            @Override
            public String getNazwa() {
                return "samolot 1";
            }
        };

        Samolot samolot2 = new Samolot() {
            @Override
            public String getNazwa() {
                return "samolot 2";

            }
        };

        Samolot samolot3 = new Samolot() {
            @Override
            public String getNazwa() {
                return "samolot 3";

            }
        };

        System.out.println(samolot.getNazwa());
        System.out.println(samolot2.getNazwa());
        System.out.println(samolot2.getNazwa());


    }
}

