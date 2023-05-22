package designpatterns.observer.interfaces;

import java.util.ArrayList;
import java.util.List;

// Step 1 - Create interface of object of interest
public abstract class Publisher {

    private List<Observer> observers = new ArrayList<>();
    public void publish() {
        observers.forEach(Observer::consume);
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
