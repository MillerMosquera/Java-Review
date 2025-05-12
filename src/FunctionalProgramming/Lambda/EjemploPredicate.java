package FunctionalProgramming.Lambda;

import FunctionalProgramming.Models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        //Predicat es una interfaz funcional que representa un predicado (boolean-valued function) de un valor de entrada.
        //Siempre retorna booleano
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r =" + r);

        Predicate<String> predicate2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(predicate2.test("ROLE"));

        //Recibe 2 argumentos y devuleve un boolean
        BiPredicate<String, String> predicate3 = (a,b) -> a.equals(b);
        System.out.println(predicate3.test("miller", "miller"));

        //simplificar con referencia metodo
        BiPredicate<String, String> predicate4 = String::equals;
        System.out.println(predicate4.test("miller", "miller"));

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("sair");
        b.setNombre("sair");
        BiPredicate<Usuario, Usuario> predicate5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(predicate5.test(a,b));
    }

}
