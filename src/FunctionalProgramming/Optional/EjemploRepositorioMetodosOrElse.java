package FunctionalProgramming.Optional;

import FunctionalProgramming.Optional.models.Computador;
import FunctionalProgramming.Optional.repositorio.IRepositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen","LA0001");
        Computador pc = repositorio.filtrar("rog2").orElse(defecto);

        System.out.println(pc);

    }
}
