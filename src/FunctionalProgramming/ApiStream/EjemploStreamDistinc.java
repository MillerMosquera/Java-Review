package FunctionalProgramming.ApiStream;

import java.util.stream.Stream;

public class EjemploStreamDistinc {
    public static void main(String[] args) {

        //Operation Distinct - se usa para eliminar duplicados
        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Paco Gonzales", "Paco Gonzales", "Paco Gonzales", "Paco Gonzales")
                .distinct();

        nombres.forEach(System.out::println);


    }

}


