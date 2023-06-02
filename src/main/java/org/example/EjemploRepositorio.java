package org.example;

import org.example.models.Computadora;
import org.example.repository.ComputadoraRepositorio;
import org.example.repository.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();



        //FORMA FUNCIONAL
            repositorio.filtrar("rog").ifPresentOrElse(System.out::println, () -> System.out.println("No se encontró"));

        //FORMA NORMAL
/*
        Optional<Computadora> pc = repositorio.filtrar("Asus Rog");
            if(pc.isPresent()){
                System.out.println(pc.get().toString());
            } else {
                System.out.println("No se encontró");
            }
*/

    }
}
