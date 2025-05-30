package FunctionalProgramming.ApiStream;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        //Operation Count - usando count para saber cuantas vacion con Empty hay
        long count = Stream
                .of("Pato Guzman","Paco Gonzales", "Pepa Gutierrez", "Pepe Mena"
                        ,"")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " +count);


    }

}


