package OOP.Ejercicios.Basicos.Empleado;

public class EmpleadoPorHoras extends Empleado implements ICalculable{

    //atributos
    double horasTrabajadas;
    double tarifasPorHoras;

    public EmpleadoPorHoras(int id, String nombre, double salarios, double horasTrabajadas, double tarifasPorHoras) {
        super(id, nombre, salarios);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifasPorHoras = tarifasPorHoras;
    }
    //metodos
    public double calcularSalario(){
        return horasTrabajadas * tarifasPorHoras;
    }

    @Override
    public double calcularSalarioAnual() {
        return calcularSalario() * 12;
    }
}
