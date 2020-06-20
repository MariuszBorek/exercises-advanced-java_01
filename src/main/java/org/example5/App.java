package org.example5;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
        Anoymous anoymous = new Anoymous() {
            @Override
            public void display() {
                System.out.println("wypisane z klasy anonimowej");
            }
        };

        anoymous.display();

        // localClass
        class LocalClass {
            private int i = 2;
            public void metodaZKlasyLocalClass() {
                System.out.println("wyświeltone z klasy lokalnej");
            }

            public int getI() {
                return i;
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.metodaZKlasyLocalClass();
        System.out.println(localClass.getI());

        // InnerClass
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        outerClass.displayInner();
        outerClass.test();
        innerClass.display();
    }
}
