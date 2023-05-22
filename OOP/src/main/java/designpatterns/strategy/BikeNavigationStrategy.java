package designpatterns.strategy;

import designpatterns.strategy.interfaces.NavigationStrategy;

// Step 2 - Concrete strategies
public class BikeNavigationStrategy implements NavigationStrategy {
    @Override
    public void navigate(String from, String to) {
        System.out.println("Driving by bike");
    }
}
