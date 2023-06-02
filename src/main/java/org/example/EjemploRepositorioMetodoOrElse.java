package org.example;

import org.example.models.Computadora;
import org.example.repository.ComputadoraRepositorio;
import org.example.repository.Repositorio;

public class EjemploRepositorioMetodoOrElse {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();

        Computadora defecto = new Computadora("HP Omen", "LA0001");

        Computadora pc = repositorio.filtrar("rog2").orElse(defecto);
        System.out.println(pc);

        pc = repositorio.filtrar("macbook").orElseGet(() -> new Computadora("Lenovo", "i5"));
        //El supplier no consume ningun argumnento pero si devuelve un objeto, del tipo del objeto por defecto
        System.out.println(pc);

    }
}
