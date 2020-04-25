package creational.abstract_factory.factories;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.checkboxes.Checkbox;

public interface AbstractFactory {

    /** Create button according OS type
     *
     * @return button
     */
    Button createButton();

    /** Create checkbox according OS type
     *
     * @return checkbox
     */
    Checkbox createCheckBox();
}
