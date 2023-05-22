package designpatterns.strategy;

import designpatterns.strategy.interfaces.NavigationStrategy;

public class CarNavigationStrategy implements NavigationStrategy {
    @Override
    public void navigate(String from, String to) {
        System.out.println("Driving by car");
    }
}
