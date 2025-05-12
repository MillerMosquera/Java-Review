package EjerciciosLogica;

public class ContarVocales {
    public static void main(String[] args) {

        String palabra = "programacion";
        String vocales = "a,e,i,o,u";
        int count = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.contains(String.valueOf(palabra.charAt(i)))) {
                count++;
            }
        }
        System.out.println(count);
    }

}
