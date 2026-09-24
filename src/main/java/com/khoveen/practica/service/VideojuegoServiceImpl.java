package com.khoveen.practica.service;

import com.khoveen.practica.model.Videojuego;
import com.khoveen.practica.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// sin textear todavia
@Service
public class VideojuegoServiceImpl implements VideojuegoService {
    private final VideojuegoRepository repository;

    public VideojuegoServiceImpl(VideojuegoRepository repository) {
        this.repository = repository;
    }


    @Override
    public Optional<Videojuego> obtenerPorId(long id) {
        return this.repository.obtenerPorId(id);
    }

    @Override
    public List<Videojuego> obtenerTodos() {
       return this.repository.obtenerTodos();
    }


    @Override
    public Videojuego guardarJuego(Videojuego videojuego) { // el id no se coloca tiene incremento propio.
        if (videojuego.getPrecio() < 0) {
            throw new IllegalArgumentException("El precio del juego no puede ser menor a cero.");
        } else if (videojuego.getAge() < 0) {
            throw new IllegalArgumentException("La edad no puede ser menor a cero.");
        } else if (videojuego.getAge() > 50) {
            throw  new IllegalArgumentException("La edad no puede ser superior a 50");
        } else if (videojuego.getTitulo() == null) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        } else if (videojuego.getTitulo().length() > 25) {
            throw new IllegalArgumentException("El titulo no puede ser superior a 25 letras");
        } else if(videojuego.getTitulo().length() < 3) {
            throw new IllegalArgumentException("El titulo no puede tener menos de 3 letras");
        } else if (videojuego.getGenero() == null || videojuego.getGenero().isEmpty()) {
            throw new IllegalArgumentException("El genero no puede estar vacio");
        }

        return this.repository.guardarJuego(videojuego);
    }

    @Override
    public void eliminarJuegoPorId(long id) {
        if (this.repository.obtenerPorId(id).isPresent()) {
            this.repository.eliminarJuegoPorId(id);
        } else {
            throw new IllegalArgumentException("No existe el id para eliminar");
        }
    }

    @Override
    public List<Videojuego> buscarPorGenero(String genero) {
        List<Videojuego> mismosGeneros = new ArrayList<>();

        for (Videojuego v : this.repository.obtenerTodos()) {
            if (v.getGenero().equals(genero)) {
                mismosGeneros.add(v);
            }
        }
        return mismosGeneros;
    }
}
