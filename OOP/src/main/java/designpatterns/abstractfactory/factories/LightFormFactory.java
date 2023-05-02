package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.models.Button;
import designpatterns.abstractfactory.models.Checkbox;
import designpatterns.abstractfactory.models.LightButton;
import designpatterns.abstractfactory.models.LightCheckbox;

// Step 4 - Create concrete factories
public class LightFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
