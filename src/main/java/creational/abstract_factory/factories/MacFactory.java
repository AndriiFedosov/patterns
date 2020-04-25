package creational.abstract_factory.factories;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.buttons.MacButton;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.checkboxes.MacCheckbox;

public class MacFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
