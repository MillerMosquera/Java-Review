package OOP.Polimorfismo;

public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println("El gato hace... Miau");
    }
}
