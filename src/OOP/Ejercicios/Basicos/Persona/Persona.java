package OOP.Ejercicios.Basicos.Persona;

import lombok.Setter;
import lombok.Getter;

public class Persona {

    @Setter @Getter
    private String nombre;
    private String apellido;
    private int edad;
    private Genero genero;

    public Persona(String nombre, String apellido, int edad, Genero genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return " Nombre=" + nombre +
                " Apellido=" + apellido +
                " Edad=" + edad +
                " Genero=" + genero;
    }

}
