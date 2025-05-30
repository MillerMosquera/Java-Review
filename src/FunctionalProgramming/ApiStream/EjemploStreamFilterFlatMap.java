package FunctionalProgramming.ApiStream;

import FunctionalProgramming.ApiStream.Models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterFlatMap {
    public static void main(String[] args) {

        //Operation flatMap - es parecido al filter, filtra y retorna el elemento encontrado
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman","Paco Gonzales", "Pepa Gutierrez", "Pepe Mena"
                        ,"Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("Pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        System.out.println(nombres.count());

    }

}


