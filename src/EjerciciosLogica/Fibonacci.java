package EjerciciosLogica;

public class Fibonacci {
    public static void main(String[] args) {

        for(int i = 1; i < 10; i++) {
            System.out.println(esFibonacci(i));
        }
    }

    static int esFibonacci(int numero) {
        return numero < 2 ? numero: esFibonacci(numero - 1) + esFibonacci(numero - 2);
    }
}
