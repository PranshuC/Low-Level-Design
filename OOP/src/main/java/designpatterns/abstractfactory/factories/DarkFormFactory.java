package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.models.Button;
import designpatterns.abstractfactory.models.Checkbox;
import designpatterns.abstractfactory.models.DarkButton;
import designpatterns.abstractfactory.models.DarkCheckbox;

public class DarkFormFactory implements FormFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
