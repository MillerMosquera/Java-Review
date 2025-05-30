package FunctionalProgramming.ApiStream;

import FunctionalProgramming.ApiStream.Models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        //Operation filter - se puede buscar por ID o por nombre tambien el findFirst que retorna el objeto
        Usuario usuario = Stream
                .of("Pato Guzman","Paco Gonzales", "Pepa Gutierrez", "Pepe Mena"
                        ,"Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(3))
                .findFirst().get();

        System.out.println(usuario);


    }

}


