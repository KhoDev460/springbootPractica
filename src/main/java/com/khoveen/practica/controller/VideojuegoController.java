package com.khoveen.practica.controller;

import com.khoveen.practica.model.Videojuego;
import com.khoveen.practica.service.VideojuegoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/juegos")
public class VideojuegoController {
    private final VideojuegoService service;

    public VideojuegoController(VideojuegoService service) {
        this.service = service;
    }

    @GetMapping("/getGameId/{id}")
    public Optional<Videojuego> obtenerPorId(@PathVariable long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/obtenerTodos")
    public List<Videojuego> obtenerTodos() {
        return service.obtenerTodos();
    }

    @PostMapping("/guardarJuego")
    public Videojuego guardarJuego(@RequestBody Videojuego videojuego) {
        return service.guardarJuego(videojuego);
    }

    @DeleteMapping("/eliminarPorId/{id}")
    public void eliminarJuegoPorId(@PathVariable long id) {
        service.eliminarJuegoPorId(id);
    }

    @GetMapping("/buscarPorGenero/{genero}")
    public List<Videojuego> buscarPorGenero(@PathVariable String genero) {
        return service.buscarPorGenero(genero);
    }
}
