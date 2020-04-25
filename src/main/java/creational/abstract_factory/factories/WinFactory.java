package creational.abstract_factory.factories;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.buttons.WinButton;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.checkboxes.WinCheckbox;

public class WinFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckbox();
    }
}
