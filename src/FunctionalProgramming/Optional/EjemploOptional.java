package FunctionalProgramming.Optional;


import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Andres";

        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        //Usando expresiones lambda
        opt.ifPresent(valor -> System.out.println("Hola " + valor));

        nombre = "Miller";
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(valor -> System.out.println("Hola" + valor),
                () -> System.out.println("No está presente"));

        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        } else {
            System.out.println("No está presente");
        }
    }
}
