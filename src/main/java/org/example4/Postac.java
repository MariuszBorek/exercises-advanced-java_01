package org.example4;

import java.util.Random;

public interface Postac extends ZywyObiekt {

    public abstract void walcz();

    String LOKACJA_STARTOWA = "Tawerna";

    static void method1() {

    }

    default String method2() {
        return "Postać";
    }

    default int uderz() {
        return wygenerujPunktyZycia();
    }

    private int wygenerujPunktyZycia() {
        Random random = new Random();
        return random.nextInt((10 - 6) + 1) + 6;
    }

}
