package OOP.Abstracción;

//Clase concreta que representa un circulo
public class Circulo extends Abstraccion {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}