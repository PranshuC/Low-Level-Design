package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.models.Button;
import designpatterns.abstractfactory.models.Checkbox;

// Step 3 - Create abstract factory interface
public interface FormFactory {

    // Step 3.5 - Add factory methods for products
    Button createButton();

    Checkbox createCheckbox();
}
