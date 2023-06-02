package org.example;

import org.example.models.Computadora;
import org.example.repository.ComputadoraRepositorio;
import org.example.repository.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodoOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();

        Computadora defecto = new Computadora("HP Omen", "LA0001");

        Computadora pc = repositorio.filtrar("rog").orElseThrow(IllegalAccessError::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);
    }
}
