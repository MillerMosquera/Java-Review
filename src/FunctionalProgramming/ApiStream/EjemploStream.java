package FunctionalProgramming.ApiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        //nombres.forEach(e -> System.out.println(e));
        nombres.forEach(System.out::println);

        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        Stream<String> name = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe").build();
        name.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepep");

        //Stream<String> names = lista.stream();
        //names.forEach(System.out::println);

        //or
        lista.stream().forEach(System.out::println);
    }
}
