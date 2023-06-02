package org.example.repository;

import org.example.models.Computadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadoraRepositorio implements Repositorio<Computadora> {

    private List<Computadora> dataSource;
    public ComputadoraRepositorio() {
        dataSource = new ArrayList<>();
        dataSource.add(new Computadora("Asus Rog", "Strix G512"));
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
