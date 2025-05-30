package FunctionalProgramming.Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        /*
        * Function es una interfaz funcional
        * que representa una función que acepta un argumento y produce un resultado.
        * */
        Function<String, String> function = (String s) -> {
            return s.toUpperCase();
        };

        System.out.println(function.apply("Miller"));

        //or
        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("Miller"));

        //BiFunction
        BiFunction <String, String, String> function3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        //String other = function3.apply("Miller", "Sair");
        System.out.println(function3.apply("Miller", "Sair"));

    }
}
