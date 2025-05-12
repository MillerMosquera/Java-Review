package OOP.Ejercicios.Basicos.CalcularBMI;

public class Main {
    public static void main(String[] args) {

        Person persona = new Person("Miller", 25, Genero.MASCULINO, 85, 1.89);

        System.out.println(persona.calculateBMI());
        System.out.println(persona);
    }
}
