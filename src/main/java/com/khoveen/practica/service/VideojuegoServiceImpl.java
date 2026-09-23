package com.khoveen.practica.service;

import com.khoveen.practica.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {

    // TODO finalizar esto (incompleto)
    private final VideojuegoRepository repository;

    public VideojuegoServiceImpl(VideojuegoRepository repository) {
        this.repository = repository;
    }


}
