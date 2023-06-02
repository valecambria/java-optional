package org.example;

import org.example.models.Computadora;
import org.example.models.Fabricante;
import org.example.models.Procesador;
import org.example.repository.ComputadoraRepositorio;
import org.example.repository.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();

        Computadora defecto = new Computadora("HP Omen", "LA0001");

        String f = repositorio.filtrar("asus")
                .flatMap(Computadora::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(f);

    }
}
