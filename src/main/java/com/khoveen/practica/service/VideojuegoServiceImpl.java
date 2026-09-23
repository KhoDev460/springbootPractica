package com.khoveen.practica.service;

import com.khoveen.practica.model.Videojuego;
import com.khoveen.practica.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {
    private final VideojuegoRepository repository;

    public VideojuegoServiceImpl(VideojuegoRepository repository) {
        this.repository = repository;
    }


    @Override
    public Optional<Videojuego> obtenerPorId(long id) {
        return Optional.empty();
    }

    @Override
    public List<Videojuego> obtenerTodos() {
        return List.of();
    }

    @Override
    public Videojuego guardarJuego(Videojuego videojuego) {
        return null;
    }

    @Override
    public void eliminarJuegoPorId(long id) {

    }

    @Override
    public List<Videojuego> buscarPorGenero(String genero) {
        return List.of();
    }
}
