import java.util.ArrayList;

public class Tipos_de_Datos {

    public static void main(String[] args) {
        System.out.println("Fundamentos de Java");
        System.out.println("Tipos de datos");

        //Al frente se comenta el valor en el rango permitido
        //Tipos de datos numericos enteros
        byte edad = 23; // -128 a 127
        short edad2 = 23; // -32768 a 32767
        int edad3 = 23; // -2147483648 a 2147483647 0 -2^31 a 2^31 -1.
        long edad4 = 23; // -9223372036854775808 a 9223372036854775807 0 -2^63 a 2^63 -1.
        //Tipos de datos flotantes
        float edad5 = 23.0f; // 1.4e-045 a 3.4e+038
        double edad6 = 23.0; // 4.9e-324 a 1.8e+308
        //Tipos de datos Booleanos y caracteres
        boolean verdadero = true; // true o false
        char caracter = 'a'; // 0 a 65535
        //Cadena de caracteres
        String cadena = "Hola mundo";

        //cuantos bits tiene cada tipo de datos
        /*System.out.println("Byte: " + Byte.SIZE);
        System.out.println("Short: " + Short.SIZE);
        System.out.println("Int: " + Integer.SIZE);
        System.out.println("Long: " + Long.SIZE);
        System.out.println("Float: " + Float.SIZE);
        System.out.println("Double: " + Double.SIZE);
        System.out.println("Boolean: " + Boolean.TRUE); // 1 bits
        System.out.println("Char: " + Character.SIZE);
        System.out.println("String: " + cadena);*/


        //Tipos de datos envueltos o Wrapper
        Integer i = Integer.valueOf(100);
        Double d = Double.parseDouble("3.14");

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        System.out.println(lista);

        Integer numero = Integer.min(10, 20);
        System.out.println(numero);




    }

}
