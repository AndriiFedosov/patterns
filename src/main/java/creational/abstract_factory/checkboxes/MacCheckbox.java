package creational.abstract_factory.checkboxes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacCheckbox implements Checkbox {
    @Override
    public void click() {
        log.info("You check Mac checkbox");
    }
}
