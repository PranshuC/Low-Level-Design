package designpatterns.observer;

import designpatterns.observer.models.Bitcoin;
import org.junit.Before;
import org.junit.Test;

public class BitcoinTrackerTest {

    private BitcoinTracker bitcoinTracker;

    @Before
    public void setUp(){
        bitcoinTracker = new BitcoinTracker(Bitcoin.builder().value(1600.00).build());
        bitcoinTracker.subscribe(new EmailService());
    }

    @Test
    public void testPriceChange() {
        bitcoinTracker.setPrice(1700.00);
    }
}
