package org.example6;

public class SomeClass {

    public void displey() {
        System.out.println("zwykły display");
    }

    public void displey(int i) {
        System.out.println("display z parametrem " + i);
    }

    public void displey(int i, int j) {
        System.out.println("display z parametremi typu int " + i + " " + j);
    }

    public void displey(double i, double j) {
        System.out.println("display z parametremi typu  double" + i + " " + j);
    }

    public void displey(Integer i) {
        System.out.println("display z parametrem Integer " + i);
    }

    public void displey(byte i) {
        System.out.println("display z parametrem byte " + i);
    }

    public void displey(float i) {
        System.out.println("display z parametrem  float " + i);
    }

}
