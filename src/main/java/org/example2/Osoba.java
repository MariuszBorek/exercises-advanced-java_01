package org.example2;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private int age;

    public Osoba(String imie, String nazwisko, int age) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.age = age;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void describe();

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", age=" + age +
                '}';
    }
}
