package EjerciciosLogica;

public class FizzBuzz {
    public static void main(String[] args) {

        int numero = 20;

        for (int i = 0; i < numero; i++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
