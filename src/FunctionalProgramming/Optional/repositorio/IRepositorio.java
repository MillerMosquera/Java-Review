package FunctionalProgramming.Optional.repositorio;

import FunctionalProgramming.Optional.models.Computador;

import java.util.Optional;

public interface IRepositorio<T> {

    Optional<Computador> filtrar(String nombre);
}
