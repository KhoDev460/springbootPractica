package com.khoveen.practica.repository;

import com.khoveen.practica.model.Videojuego;

import java.util.List;
import java.util.Optional;

public interface VideojuegoRepository {
    Optional<Videojuego> obtenerPorId(long id);

    List<Videojuego> obtenerTodos();
    Videojuego guardarJuego(Videojuego videojuego);
    void eliminarJuegoPorId(long id);

    List<Videojuego> buscarPorGenero(String genero);
}
