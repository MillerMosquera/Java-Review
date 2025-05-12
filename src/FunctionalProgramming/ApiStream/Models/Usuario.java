package FunctionalProgramming.ApiStream.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Usuario {

    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
    }
}
