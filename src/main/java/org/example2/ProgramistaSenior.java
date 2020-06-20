package org.example2;

import java.util.Arrays;

public class ProgramistaSenior extends Programista {
    private String[] specjalizacja;
     /*
    1. Rozwiń przykład 2. Utwórz dodatkową Klasę ProgramistaSenior
    niech ta klasa dziedziczy po klasie Programista. Dodaj do tej klasy jakieś wyróżniające się pole.
    Następnie utwórz Tablicę z 4 pracownikami, niech będą to pracownicy różnego typu, dodaj tablicę
    do nowo utworzonego menadżera - po czym wyświetl jego imię i nazwisko, a także imiona i nazwiska
    podległych mu pracowników wraz z ich stanowiskami.
    */

    public ProgramistaSenior(String imie, String nazwisko, int age, int pensja, String[] znaneJezyki, String[] specjalizacja) {
        super(imie, nazwisko, age, pensja, znaneJezyki);
        this.specjalizacja = specjalizacja;
    }

    public String[] getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String[] specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "ProgramistaSenior" + super.toString() +
                "jezykProgramowania=" + Arrays.toString(specjalizacja);
    }
}
