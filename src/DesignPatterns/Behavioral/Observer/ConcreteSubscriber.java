package DesignPatterns.Behavioral.Observer;

public class ConcreteSubscriber implements ISubscriber {

    @Override
    public void update(String context) {
        System.out.println("ConcreteSubscriber: " + context);
    }
}
