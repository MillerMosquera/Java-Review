package FunctionalProgramming.Optional.models;

import lombok.*;

@Getter
@Setter
@ToString
public class Computador {

    private String nombre;
    private String modelo;

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }
}
