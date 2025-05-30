package FunctionalProgramming.Lambda;


import FunctionalProgramming.Models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {


        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();

        /*
        * Consumer es una interfaz funcional que recibe un parametro y no devuelve nada
        * su principal metodo es accept
        */
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumer.accept(new Date());

        /*
        * BiConsumer es una interfaz funcional que recibe dos parametros y no devuelve nada
        * */
        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años");
        biConsumer.accept("Miller", 23);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("Miller", "Andres", "Juan", "Pedro");
        nombres.forEach(consumer2);

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "Miller");
        System.out.println(usuario.getNombre());

        /*
        * Supplier es una interfaz funcional que no recibe parametros y devuelve un valorv
        * */
        Supplier<String> proveedor = () ->{
            return "Hola mundo, lambda supplier";
        };
        System.out.println(proveedor.get());
    }
}
