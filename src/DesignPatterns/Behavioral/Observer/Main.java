package DesignPatterns.Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        /*Permite definir un mecanismo de suscripción para notificar
        a varios objetos sobre cualquier evento que le suceda al objeto que están observando.
         */

        ConcreteSubscriber concreteSubscriber = new ConcreteSubscriber();
        Publisher publisher = new Publisher();
        publisher.subscriber(concreteSubscriber);

        publisher.mainBusinessLogic();
        publisher.update("update");
        publisher.unsubscribe(concreteSubscriber);

    }
}


