package OOP.Abstracción;

public class Test {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Reactangulo rectangulo = new Reactangulo(4,6);

        System.out.println("El área del circulo es: " + circulo.calcularArea());
        System.out.println("El área del rectangulo es: " + rectangulo.calcularArea());
    }
}