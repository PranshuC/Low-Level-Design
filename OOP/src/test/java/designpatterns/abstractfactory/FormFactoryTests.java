package designpatterns.abstractfactory;

import designpatterns.abstractfactory.factories.DarkFormFactory;
import designpatterns.abstractfactory.factories.FormFactory;
import designpatterns.abstractfactory.factories.LightFormFactory;
import designpatterns.abstractfactory.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FormFactoryTests {

    private FormFactory factory;

    @Before
    public void setUp() {
        //factory = new DarkFormFactory();
        factory = new LightFormFactory();
    }

    @Test
    public void testFormFactory() {
        Button darkBtn = factory.createButton();
        Checkbox darkCheckbox = factory.createCheckbox();
        // Change of factory above, changes behaviour of complete application
        //assertTrue("If button factory is called, button should be dark", darkBtn instanceof DarkButton);
        //assertTrue("If checkbox factory is called, checkbox should be dark", darkCheckbox instanceof DarkCheckbox);
        assertTrue("If button factory is called, button should be dark", darkBtn instanceof LightButton);
        assertTrue("If checkbox factory is called, checkbox should be dark", darkCheckbox instanceof LightCheckbox);
    }
}
