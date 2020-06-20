package org.zad_3;

public abstract class Samolot {
    /*
    2. Stwórz klasę abstrakcyjną o nazwie Samolot, wraz z metodą getNazwa(),
    zwracającą wartość Stringa z nazwą samolotu. Stwórz 3 różne klasy anonimowe od tej klasy
    abstrakcyjnej i wyświetl nazwy tych samolotów
     */

    private String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
