package org.zad_3;

public class App {
    public static void main(String[] args) {
        Samolot samolot = new Samolot() {
            @Override
            public String getNazwa() {
                setNazwa("samolot 1");
                return super.getNazwa();

            }
        };

        Samolot samolot2 = new Samolot() {
            @Override
            public String getNazwa() {
                setNazwa("samolot 2");
                return super.getNazwa();

            }
        };

        Samolot samolot3 = new Samolot() {
            @Override
            public String getNazwa() {
                setNazwa("samolot 3");
                return super.getNazwa();

            }
        };

        System.out.println(samolot.getNazwa());
        System.out.println(samolot2.getNazwa());
        System.out.println(samolot2.getNazwa());


    }
}

