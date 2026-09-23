package com.khoveen.practica.repository;

import com.khoveen.practica.model.Videojuego;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VideojuegoRepositoryImpl implements VideojuegoRepository {

    private List<Videojuego> juegos = new ArrayList<>(); // almacena los datos de los juegos

    // get the game, mediante el id
    @Override
    public Optional<Videojuego> obtenerPorId(long id) {
        for (Videojuego v : juegos) {
            if (v.getId() == id) {
                return Optional.of(v);
            }
        }
        return Optional.empty();
    }

    @Override
    // devuelve todos los juegos
    public List<Videojuego> obtenerTodos() {
        return juegos;
    }

    // guarda un juego
    @Override
    public Videojuego guardarJuego(Videojuego juego) {
        juegos.add(juego);
        return juego;
    }

    @Override
    // eliminar el juego mediante el id
    public void eliminarJuegoPorId(long id) {
        juegos.removeIf(v -> v.getId()==id); // funcion lambda
    }

    @Override
    public List<Videojuego>buscarPorGenero(String genero) {
        List<Videojuego> juegosMismoGenero = new ArrayList<>();

        for (Videojuego g : juegos) {
            if(g.getGenero().equals(genero)) {
                juegosMismoGenero.add(g); // si hay coincidencia en el recorrido del array lo mete en el array de 'juegosMismoGenero'
            }
        }
        return juegosMismoGenero;
    }

}
