package FunctionalProgramming.ApiStream;

import FunctionalProgramming.ApiStream.Models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        //Operador map transforma los elementos de una secuencia de un tipo a otro
        /* Stream.of("Pato", "Paco", "Pepa", "Pepe").map(nombre -> {
            return nombre.toUpperCase();
        }).forEach(e -> System.out.println(e));
         */
        /*
        Stream<String> nombres = Stream
                .of("Pato", "Paco", "Pepa", "Pepe")
                .peek(e -> System.out.println(e))
                .map(nombre -> {
                    return nombre.toUpperCase();
                });
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);
         */

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }

}


