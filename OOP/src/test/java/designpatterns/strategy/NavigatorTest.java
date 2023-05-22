package designpatterns.strategy;

import designpatterns.strategy.interfaces.NavigationStrategy;
import org.junit.Before;
import org.junit.Test;

public class NavigatorTest {

    private Navigator navigator;

    @Before
    public void setUp() {
        navigator = new Navigator(new CarNavigationStrategy());
    }

    @Test
    public void testNavigator() {
        navigator.navigate("","");
    }
}
