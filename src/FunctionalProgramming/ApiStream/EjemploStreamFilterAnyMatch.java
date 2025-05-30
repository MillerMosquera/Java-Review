package FunctionalProgramming.ApiStream;

import FunctionalProgramming.ApiStream.Models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        //Operation anyMathc - para este caso se usa para saber si existe o no la persona por el ID
        boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena"
                        , "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(3));

        System.out.println(existe);


    }

}


