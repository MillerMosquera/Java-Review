package DesignPatterns.Creational.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        -Con este patron, nos aseguramos que una Clase tenga una única instancia y
        que proporciona un punto de acceso global a dicha instancia
        -Vulnera el principio de responsabilidad única
        */
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);


    }
}
