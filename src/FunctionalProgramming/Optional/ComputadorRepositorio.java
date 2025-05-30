package FunctionalProgramming.Optional;

import FunctionalProgramming.Optional.models.Computador;
import FunctionalProgramming.Optional.repositorio.IRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements IRepositorio<Computador> {

    private List<Computador> dataSource = new ArrayList<>();

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        dataSource.add(new Computador("ASUS ROG", "Strix G512"));
        dataSource.add(new Computador("MacBook", "MVVK2CI"));
    }


    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
        /*for(Computador c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
