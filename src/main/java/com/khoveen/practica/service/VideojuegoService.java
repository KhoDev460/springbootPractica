package com.khoveen.practica.service;

import com.khoveen.practica.model.Videojuego;

import java.util.List;
import java.util.Optional;

public interface VideojuegoService {
    Optional<Videojuego> obtenerPorId(long id);

    List<Videojuego> obtenerTodos();
    Videojuego guardarJuego(Videojuego videojuego);
    void eliminarJuegoPorId(long id);

    List<Videojuego> buscarPorGenero(String genero);
}
