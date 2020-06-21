package org.example_typygeneryczne.example_1;

public class App {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Osoba> osobaBox = new Box<>();
        integerBox.setT(5);
        System.out.println(integerBox.getT());
        stringBox.setT("Maria");
        System.out.println(stringBox.getT());
        osobaBox.setT(new Osoba("Jan", "Kowalski"));
        System.out.println(osobaBox.getT().getImie());
        String imie2 = stringBox.getT();
        ObjectBox objectBox = new ObjectBox();
        objectBox.setObject("Janusz");
        String imie = (String)objectBox.getObject();
    }
}
