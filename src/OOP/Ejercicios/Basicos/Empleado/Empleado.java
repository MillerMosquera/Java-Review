package OOP.Ejercicios.Basicos.Empleado;

public class Empleado {

    int id;
    String nombre;
    double salario;

    public Empleado(int id, String nombre, double salario){
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
}
