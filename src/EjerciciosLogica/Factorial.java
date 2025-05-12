package EjerciciosLogica;

public class Factorial {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(esFactorial(i));
        }
    }

    static int esFactorial(int n) {
        int factorial = 0;
        if (n >= 0) factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
