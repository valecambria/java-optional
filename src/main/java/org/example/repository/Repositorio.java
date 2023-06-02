package org.example.repository;

import org.example.models.Computadora;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computadora> filtrar(String nombre);
}
