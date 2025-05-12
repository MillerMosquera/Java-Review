package FunctionalProgramming.ApiStream;

import FunctionalProgramming.ApiStream.Models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        //Convertir de List a Stream
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Miller", "Mosquera"));
        lista.add(new Usuario("Sair", "Palacios"));
        lista.add(new Usuario("Sair", "mosquera"));

        //lista.stream();
        Stream<String> nombres = lista.stream().map(u -> u.getNombre()
                        .toUpperCase().concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("sair".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());
    }
}