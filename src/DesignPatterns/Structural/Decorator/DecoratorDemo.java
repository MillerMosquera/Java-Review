package DesignPatterns.Structural.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

      // Permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.
        ICoffee coffee = new BasicCoffee();
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.GetDescription());
        System.out.println(coffee.GetCost());


    }
}
