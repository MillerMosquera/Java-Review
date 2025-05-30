package OOP.Ejercicios.Basicos.CalcularBMI;

public class Person {

    private String nombre;
    private int edad;
    private Genero genero;
    private double peso;
    private double altura;

    //Constructor predeterminado
    public Person() {
    }

    public Person(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Person(String nombre, int edad, Genero genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculateBMI() {
        double pesoIdeal = this.peso / (this.altura * altura);
        if (pesoIdeal < 18.5) {
            System.out.println("Bajo peso: ");
        } else if (pesoIdeal >= 18.5 && pesoIdeal <= 24.9) {
            System.out.println("Peso normal: ");
        } else if (pesoIdeal >= 25 && pesoIdeal <= 29.9) {
            System.out.println("Sobrepeso: ");
        } else {
            System.out.println("Sobre peso: ");
        }
        return pesoIdeal;
    }

    public boolean idAdult() {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
