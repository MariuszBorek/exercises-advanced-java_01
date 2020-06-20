package org.example2;

import java.util.Arrays;

public class Manager extends Pracownik {

    private Pracownik[] podlegliPracownicy;

    public Manager(String imie, String nazwisko, int age, int pensja, Pracownik[] podlegliPracownicy) {
        super(imie, nazwisko, age, pensja);
        this.podlegliPracownicy = podlegliPracownicy;
    }

    public Pracownik[] getPodlegliPracownicy() {
        return podlegliPracownicy;
    }

    public void setPodlegliPracownicy(Pracownik[] podlegliPracownicy) {
        this.podlegliPracownicy = podlegliPracownicy;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("ale tez jestem manger");
        System.out.println(Arrays.toString(podlegliPracownicy));
    }

    @Override
    public String toString() {
        return "Manager{"+ super.toString() +
                "podlegliPracownicy=" + "Podlegi pracownicy: " + "\n" + Arrays.toString(podlegliPracownicy) +
                '}';
    }
}
