package org.example_wyjatki.example_2;

public class MyException extends Exception { // extends Exception(Wymusza wyjątek), extends RuntimeException(Niewymusza wyjątku)

    MyException(String message) {
        super(message);
    }
}
