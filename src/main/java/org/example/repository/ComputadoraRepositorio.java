package org.example.repository;

import org.example.models.Computadora;
import org.example.models.Fabricante;
import org.example.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadoraRepositorio implements Repositorio<Computadora> {

    private List<Computadora> dataSource;
    public ComputadoraRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computadora asus = new Computadora("Asus Rog", "Strix G512");
        asus.setProcesador(proc);
        dataSource.add(asus);
        dataSource.add(new Computadora("Macbook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computadora> filtrar(String nombre) {
        return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase())).findFirst();
/*        for (Computadora c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
