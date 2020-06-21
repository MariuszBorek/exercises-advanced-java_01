package org.example_wyjatki.example_2;

import java.util.Random;

public class Operacja {
    Random random = new Random();

    public void operuj() throws MyException {
        int szansaNaBlad = random.nextInt(10);
        if(szansaNaBlad>5) {
            popelnijBlad();
        }
    }

    private void popelnijBlad() throws MyException{
        throw new MyException("przeciołeś tętnice");
    }



}
