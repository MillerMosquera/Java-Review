package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_colas {
    public static void main(String[] args) {
        //QUEUE o Colas - primero en entrar, primero en salir
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Juan", 21));

        System.out.println(supermarket.peek());
    }
    static record Person(String name, int age){}
}
