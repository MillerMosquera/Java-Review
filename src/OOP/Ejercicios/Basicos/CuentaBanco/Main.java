package OOP.Ejercicios.Basicos.CuentaBanco;

import java.util.AbstractCollection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double depositar = 0;
        double retirar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de cuenta bancaria");
        System.out.println("Ingrese el nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el saldo: ");
        double saldo = scanner.nextDouble();

        Account acount = new Account(nombre, saldo);

        while (true) {
            System.out.println("\n=== MENÚ DE CUENTA BANCARIA ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int eleccion = scanner.nextInt();

            try {
                switch (eleccion) {
                    case 1:
                        System.out.print("Ingresar su deposito: ");
                        depositar = scanner.nextDouble();
                        acount.deposit(depositar);
                        break;
                    case 2:
                        System.out.print("Cuanto desea retirar? ");
                        retirar = scanner.nextDouble();
                        acount.withdraw(retirar);
                        break;
                    case 3:
                        System.out.println("Su saldo es: " + acount.getAmount());
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción invalida");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
