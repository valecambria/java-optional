package org.example;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Andrés";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()){
            System.out.println("hola " + opt.get());
        }
        System.out.println(opt.isEmpty());
        opt.ifPresent(valor -> {
            System.out.println("hola " + valor);
        });

        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);

        System.out.println(opt.isPresent());

        opt.ifPresentOrElse(valor -> System.out.println("valor: " + valor), () -> System.out.println("No está presente"));

        if(opt.isPresent()){
            System.out.println(opt.get());
        } else {
            System.out.println("No está presente");
        }
    }
}