package org.example;

public class NullValueException extends RuntimeException {

    // Costruttore che accetta un messaggio personalizzato
    public NullValueException(String message) {
        super(message);
    }
}
