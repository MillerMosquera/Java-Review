package DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;

public class Publisher implements ISubscriber {

    private ArrayList<ISubscriber> subscribers = new ArrayList<ISubscriber>();
    private String mainState;

    public void subscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(this.subscribers.toString());
        }
    }

    public void mainBusinessLogic() {
        this.mainState = "mainState";
        notifySubscribers();
    }

    @Override
    public void update(String context) {
        System.out.println("Publisher: " + context);
    }
}


