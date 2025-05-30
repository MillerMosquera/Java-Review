package Optional;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {

        //Optional: representa un contenedor que puede o no contener un valor no nulo
        Optional<String> nombre = Optional.of("Miller");

        if(nombre.isPresent()){
            System.out.println("El nombre es: " + nombre.get());
        }else {
            System.out.println("El nombre no está presente");
        }

        nombre = Optional.empty();
        System.out.println(nombre.orElse("Nombre Desconocido"));
        //También podemos usar nombre.orElseThrow()

    }
}
