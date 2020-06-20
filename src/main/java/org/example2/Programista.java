package org.example2;

public class Programista extends Pracownik {

    private String[] znaneJezyki;

    public Programista(String imie, String nazwisko, int age, int pensja, String[] znaneJezyki) {
        super(imie, nazwisko, age, pensja);
        this.znaneJezyki = znaneJezyki;
    }

    public String[] getZnaneJezyki() {
        return znaneJezyki;
    }

    public void setZnaneJezyki(String[] znaneJezyki) {
        this.znaneJezyki = znaneJezyki;
    }
}
