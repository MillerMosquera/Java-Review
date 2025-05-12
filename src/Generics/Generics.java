package Generics;

public class Generics {
    /*
    * Los genéricos son un mecanismo que permite crear clases y métodos que pueden trabajar con diferentes tipos de datos.
    * Los genéricos se utilizan para evitar errores de tipo y para escribir código más reutilizable.
    */
    public static void main(String[] args) {
        GenericsExample<String> stringExample = new GenericsExample<>("Hola mundo");
        System.out.println(stringExample.getValue());

        GenericsExample<Integer> integerExample = new GenericsExample<>(23);
        System.out.println(integerExample.getValue());
    }
}

