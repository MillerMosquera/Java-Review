package Recursividad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Componente {

    private String nombre;
    private List<Componente> hijos;
    private int nivel;

    public Componente(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<Componente>();
    }

    public Componente addComponent(Componente e){
        this.hijos.add(e);
        return this;
    }

    public boolean tieneHijos(){
        return this.hijos.isEmpty();
    }
}
