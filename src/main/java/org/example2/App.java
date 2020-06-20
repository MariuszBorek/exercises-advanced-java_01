package org.example2;

public class App {
    public static void main(String[] args) {


        Pracownik[] pracownicy = new Pracownik[5];
        pracownicy[0] = new Pracownik("Jessica", "Mercedes", 12, 10_000);
        pracownicy[1] = new Pracownik("Malwina", "Giertych", 7, 9_000);
        pracownicy[2] = new Pracownik("Basia", "MBW", 78, 5_445);
        pracownicy[3] = new Pracownik("Grzegorz", "Woznaik", 23, 5_445);
        pracownicy[4] = new Pracownik("Łukasz", "Zefir", 72, 5_445);

        Osoba student1 = new Student();
        Osoba student2 = new Student("Weronika", "Gebert", 26, 87787);
        Osoba pracownik1 = new Pracownik("Maria", "Wagner", 600, 9_000);

        student1.describe();
        student2.describe();
        pracownik1.describe();

        Osoba manager = new Manager("Arek", "Luliński", 56,467, pracownicy);

        System.out.println(manager.toString());

        String[] jezykiProgramowania = {"java", "python", "php", "javascript"};
        String[] specjalizacja = {"spring", "coś tam"};

        Osoba osoba = new ProgramistaSenior("Jan", "Niezbedny", 25, 20_000, jezykiProgramowania, specjalizacja);
        System.out.println(osoba.toString());

    }
}
