package FunctionalProgramming.ApiStream;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        //Operation Reduce - operador terminal, que finaliza, que se usa para reducir, operar a un valor o tambien para concatenar
        Stream<String> nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Paco Gonzales", "Paco Gonzales", "Paco Gonzales", "Paco Gonzales")
                .distinct();

        String resultado = nombres.reduce("", (a, b) -> a + "," + b);
        System.out.println("resultado = " + resultado);


    }

}


