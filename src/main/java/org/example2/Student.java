package org.example2;

public class Student extends Osoba {
    private  int nrIndexu;

    public Student() {
        this("unknow", "unknow", 1,0);
    }

    public Student(String imie, String nazwisko, int age, int nrIndexu) {
        super(imie, nazwisko, age);
        this.nrIndexu = nrIndexu;
    }

    @Override
    public void describe() {
        System.out.println("jestem studentem " + getImie() + " " + getNazwisko() + " " + nrIndexu);
    }
}
