package creational.abstract_factory.buttons;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WinButton implements Button {
    @Override
    public void click() {
        log.info("You click on Windows button");
    }
}
