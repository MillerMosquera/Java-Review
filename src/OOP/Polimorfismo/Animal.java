package OOP.Polimorfismo;

public abstract class Animal implements ISonido {

    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
