package org.example2;

public class Pracownik extends Osoba {
    private int pensja;

    public Pracownik(String imie, String nazwisko, int age, int pensja) {
        super(imie, nazwisko, age);
        this.pensja = pensja;
    }

    @Override
    public void describe() {
        System.out.println("jestem pracownikiem " + getImie() + " " + getNazwisko() + " " + pensja);
    }

    @Override
    public String toString() {
        return super.toString() + pensja;
    }
}
