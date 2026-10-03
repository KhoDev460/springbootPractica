package com.khoveen.practica.exception;

public class GeneroNoEncontradoException extends RuntimeException {
    public GeneroNoEncontradoException(String genero) {
        super("Genero no encontrado" + genero);
    }
}
