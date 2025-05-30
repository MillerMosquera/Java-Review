package OOP.Abstracción;

public class Reactangulo extends Abstraccion {

    private double ancho;
    private double alto;

    public Reactangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }
}