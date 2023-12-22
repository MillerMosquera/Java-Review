//importar loombok


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Tipos de referencia // Objetos
        /*
        int age = 21;
        Point pointA = new Point(10,10);
        System.out.println("Point A: " + pointA);
        pointA.move(10,11);
        System.out.println("Point A: " + pointA);*/

        //Arrays
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 33;
        number[2] = 5;

        /*System.out.println(
                Arrays.toString(number));*/
        //other form
        int[] number2 = {1,2,3,4,5};
        System.out.println(
                Arrays.toString(number2));

        //Array null values
        int[] number3 = new int[3];
        number3[0] = 2;
        System.out.println(
                Arrays.toString(number3));

        //Loops and Arrays
        String[] names = {"Juan", "Pedro", "Maria"};

        for (String name: names){
            System.out.println(name);
        }

        System.out.println("\n");
        //ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);

        numbers.forEach(num -> System.out.println(num * 2));
        System.out.println(numbers.toString());

        //if Statements
        if(true){
            System.out.println("Hola");
        }else{
            System.out.println("Adios");
        }

        //Switch
        int day = 1;

        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro dia");
        }

        //Methods
        /*
        - Modificadores de acceso: public private protected
        - Optional: static, final, abstract, synchronized
        - Tipo de retorno: void, int, String, etc
        - Nombre del metodo: main
        - Parametros: String[] args
        - Cuerpo del metodo: System.out.println("Hola " + name);
        - Valor de retorno: no hay que es tipo voy pero puede ser int, String, etc
         */

       /* public static void main(String[] args){
            System.out.println("Hola" );
        }*/

        //Example
        /*private static int sum(int a, int b){
            return a + b;
        }*/

        //Classes and objects
        Cat cat = new Cat();
        cat.nameCat = "Tom";
        cat.meow();

    }
    static class Cat {
        String nameCat;
        void meow(){
            System.out.println(nameCat + ": Meow...");
        }
    }

}