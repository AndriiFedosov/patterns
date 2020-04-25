package creational.abstract_factory;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.factories.AbstractFactory;
import creational.abstract_factory.factories.MacFactory;
import creational.abstract_factory.factories.WinFactory;
import lombok.Getter;

@Getter
public class FactoryProducer {
    private AbstractFactory factory;
    private Button button;
    private Checkbox checkbox;

    public FactoryProducer(Type type) throws IllegalAccessException {
        AbstractFactory abstractFactory;
        switch (type) {
            case WINDOWS: {
                abstractFactory = new WinFactory();
                break;
            }
            case MAC: {
                abstractFactory = new MacFactory();
                break;
            }
            default: {
                throw new IllegalAccessException();
            }
        }
        this.factory = abstractFactory;
        this.button = abstractFactory.createButton();
        this.checkbox = abstractFactory.createCheckBox();

    }

    public void click() {
        button.click();
        checkbox.click();
    }
}
