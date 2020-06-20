package org.example;

import java.util.Objects;

public class Tygrys extends Zwierze {
    private int iloscPaskow;

    public Tygrys() {
        super();
//        super("Zwierze", 4); // można nadać odrazu tutaj
    }

    public Tygrys(int iloscPaskow) {
        super("Ziomek", 4);
        this.iloscPaskow = iloscPaskow;
    }

    public Tygrys(String nazwa, int iloscLap, int iloscPaskow) {
        super(nazwa, iloscLap);
        this.iloscPaskow = iloscPaskow;
    }

    public int getIloscPaskow() {
        return iloscPaskow;
    }

    public void setIloscPaskow(int iloscPaskow) {
        this.iloscPaskow = iloscPaskow;
    }

    @Override
    public String toString() {
        return super.toString() + iloscPaskow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tygrys tygrys = (Tygrys) o;
        return iloscPaskow == tygrys.iloscPaskow;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iloscPaskow);
    }
}
