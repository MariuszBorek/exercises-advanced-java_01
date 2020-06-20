package org.example;

import java.util.Objects;

public class Zwierze {

    private String nazwa;
    private int iloscLap;

    public Zwierze() {
    }

    public Zwierze(String nazwa, int iloscLap) {
        this.nazwa = nazwa;
        this.iloscLap = iloscLap;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscLap() {
        return iloscLap;
    }

    public void setIloscLap(int iloscLap) {
        this.iloscLap = iloscLap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zwierze zwierze = (Zwierze) o;
        return iloscLap == zwierze.iloscLap &&
                Objects.equals(nazwa, zwierze.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, iloscLap);
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "nazwa='" + nazwa + '\'' +
                ", iloscLap=" + iloscLap +
                '}';
    }
}
