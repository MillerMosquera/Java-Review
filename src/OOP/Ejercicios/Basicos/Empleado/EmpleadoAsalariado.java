package OOP.Ejercicios.Basicos.Empleado;

public class EmpleadoAsalariado extends Empleado implements ICalculable {



    public EmpleadoAsalariado(int id, String nombre, double salarios){
        super(id, nombre, salarios);

    }

    //metodo
    public double calcularSalario() {
        return salario;
    }

    @Override
    public double calcularSalarioAnual() {
        return calcularSalario() * 12;
    }
}
