package org.example_wyjatki.example_1;

public class App {
    public static void main(String[] args) {

        String text = null;

        try {
            System.out.println(text.charAt(0));
        } catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("nie mozna odwoływać sie do pol i obiektow ktore sa nulem");
        }

        System.out.println("program leci dalej: wyswietli sie ten tekst");

        SomeClass someClass = new SomeClass();

        // uncheck exception
        someClass.testFt();

        // check exception
        try {
            someClass.testSe();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
