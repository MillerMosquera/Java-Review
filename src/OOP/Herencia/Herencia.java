package OOP.Herencia;

public class Herencia {
    public static void main(String[] args) {
        //crear un objeto de la clase Perro
        Perro miPerro = new Perro();
        //acceder al metodo ladrar() de la clase Perro
        miPerro.ladrar();
        //acceder al metodo hacerSonido() de la clase Animal
        miPerro.hacerSonido();
    }
    //definir una Clase Animal (superclase)
    static class Animal {
        void hacerSonido() {
            System.out.println("Haciendo un sonido");
        }
    }
    //definir una subclase (perro) que hereda de la Clase (Animal)
    static class Perro extends Animal {
        void ladrar() {
            System.out.println("Ladrando");
        }
    }
}
