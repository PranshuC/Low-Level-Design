package designpatterns.observer;

import designpatterns.observer.interfaces.Observer;
import designpatterns.observer.interfaces.Publisher;
import designpatterns.observer.models.Bitcoin;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

// Step 3- Add concrete Publishers

@AllArgsConstructor
public class BitcoinTracker extends Publisher {

    private Bitcoin bitcoin;

    public void setPrice(Double value) {
        bitcoin = bitcoin.toBuilder().value(value).build(); // state change
        publish();
    }
}
