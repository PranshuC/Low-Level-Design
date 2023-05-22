package designpatterns.observer;

import designpatterns.observer.interfaces.Observer;

public class EmailService implements Observer {
    @Override
    public void consume() {
        System.out.println("Email Sent");
    }
}
