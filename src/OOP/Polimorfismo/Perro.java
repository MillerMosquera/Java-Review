package OOP.Polimorfismo;

public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println("El perro hace... Guau");
    }
}
