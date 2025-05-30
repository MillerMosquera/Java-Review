package OOP.Objeto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//getters and setters usando lombok
@Getter
@Setter
@ToString
public class Persona {

    //Atributos
    String nombre;
    String apellido;
    int edad;

    //Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //ejmeplo de Metodo para llamar a la persona
    public void llamarPersona(){
        System.out.println("Llamando a " + this.nombre + " " + this.apellido);
    }

}
