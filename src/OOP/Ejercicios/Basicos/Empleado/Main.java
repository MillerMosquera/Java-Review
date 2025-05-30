package OOP.Ejercicios.Basicos.Empleado;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Locale, sirve para dar formato a los numeros de acuerdo a la region
        Locale locale = new Locale("es", "CO");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        //Empleado asalariado
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(2, "Pedro", 1700000);

        String sueldo = numberFormat.format(empleadoAsalariado.calcularSalario());
        String sueldoAnual = numberFormat.format(empleadoAsalariado.calcularSalarioAnual());

        System.out.println(new StringBuilder().
                append("El empleado: ").append(empleadoAsalariado.nombre).
                append(" tiene un salario de: ").append(sueldo).
                append(" y un salario anual de: ").append(sueldoAnual));

        //Empleado que trabaja por horas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(1, "Juan", 1160000, 42, 30000);

        String sueldoPorHoras = numberFormat.format(empleadoPorHoras.calcularSalario());
        String sueldoAnualPorHoras = numberFormat.format(empleadoPorHoras.calcularSalarioAnual());

        System.out.println(new StringBuilder().
                append("El empleado: ").append(empleadoPorHoras.nombre).
                append(" tiene un salario de: ").append(sueldoPorHoras).
                append(" y un salario anual de: ").append(sueldoAnualPorHoras));

    }
}
