package EjerciciosLogica;

import java.util.HashSet;
import java.util.Set;

public class Isograma {
    public static void main(String[] args) {

        String palabra = "Hola";

        System.out.println(esIsograma(palabra));
        if (esIsograma(palabra) == true) {
            System.out.println("Es un Isograma");
        } else System.out.println("No es un Isograma");
    }

    static boolean esIsograma(String palabra) {

        palabra = palabra.toLowerCase();
        Set<Character> cadena = new HashSet<>();

        for (char letra : palabra.toCharArray()) {
            if (cadena.contains(letra)) {
                return false;
            }
            cadena.add(letra);
        }
        return true;
    }
}
