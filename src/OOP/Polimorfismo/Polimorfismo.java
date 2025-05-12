package OOP.Polimorfismo;

public class Polimorfismo {
    // Polimorfismo: Es la capacidad de un objeto de tomar varias formas.
    // En Java, un objeto puede comportarse de varias formas, incluso si su tipo es el mismo.
    // Por ejemplo, una clase Animal puede tener un método hacerSonido(), pero los métodos hacerSonido() de un perro y un gato serán diferentes.
    public static void main(String[] args) {

        Animal perro = new Perro("Firulais");
        perro.hacerSonido();

        Animal gato = new Gato("Michi");
        gato.hacerSonido();
    }
}
