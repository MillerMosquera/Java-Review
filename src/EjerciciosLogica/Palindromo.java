package EjerciciosLogica;

public class Palindromo {
    public static void main(String[] args) {

        String palabra = "oso";

        if (palabra.equals(esPalindromo(palabra))) {
            System.out.println("Es palíndromo");
        } else System.out.println("No es palíndromo");
    }

    static String esPalindromo(String palabra) {

        palabra = palabra.toLowerCase();
        String cadenaConvetida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            cadenaConvetida += palabra.charAt(i);
        }
        return cadenaConvetida;
    }
}
