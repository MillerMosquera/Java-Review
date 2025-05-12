package FunctionalProgramming.Optional;

import FunctionalProgramming.Optional.models.Computador;
import FunctionalProgramming.Optional.repositorio.IRepositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println, () -> System.out.println("No se encontró"));

        Optional<Computador> pc = repositorio.filtrar("asus");
       /* if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }
        */


    }
}
