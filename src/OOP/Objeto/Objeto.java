package OOP.Objeto;

public class Objeto {
    public static void main(String[] args) {
        /*
        * Cualquier entidad que tenga estado y comportamiento se conoce como objeto
        */
        //Instanciar un objeto
        Persona persona = new Persona("Juan", "Perez", 20);

        //En caso de que tenga más métodos para llamar a persona
        persona.llamarPersona();

    }
}
