package creational.abstract_factory;

import creational.abstract_factory.buttons.MacButton;
import creational.abstract_factory.buttons.WinButton;
import creational.abstract_factory.checkboxes.MacCheckbox;
import creational.abstract_factory.checkboxes.WinCheckbox;
import creational.abstract_factory.factories.MacFactory;
import creational.abstract_factory.factories.WinFactory;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AbstractFactoryTest {
    @Test
    public void should_create_win_stuff() throws IllegalAccessException {
        //given
        FactoryProducer factoryProducer = new FactoryProducer(Type.WINDOWS);
        //when
        factoryProducer.click();
        //then
        assertThat(factoryProducer.getFactory()).isInstanceOf(WinFactory.class);
        assertThat(factoryProducer.getButton()).isInstanceOf(WinButton.class);
        assertThat(factoryProducer.getCheckbox()).isInstanceOf(WinCheckbox.class);
    }

    @Test
    public void should_create_mac_stuff() throws IllegalAccessException {
        //given
        FactoryProducer factoryProducer = new FactoryProducer(Type.MAC);
        //when
        factoryProducer.click();
        //then
        assertThat(factoryProducer.getFactory()).isInstanceOf(MacFactory.class);
        assertThat(factoryProducer.getButton()).isInstanceOf(MacButton.class);
        assertThat(factoryProducer.getCheckbox()).isInstanceOf(MacCheckbox.class);
    }

    @Test
    public void should_throw_exception_of_type() throws IllegalAccessException {
        //given && when && then
        assertThatThrownBy(() -> new FactoryProducer(Type.UNKNOWN)).isInstanceOf(IllegalAccessException.class);
    }
}
