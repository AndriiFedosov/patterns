package structural.decorator;

import org.testng.annotations.Test;
import structural.decorator.extra.DoubleExtra;
import structural.decorator.extra.NoExtra;
import structural.decorator.extra.RegularExtra;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {

    @Test
    public void should_create_full_order(){
        //given
        Order pizza = Pizza.builder().label("Hawaii pizza").price(23.33).build();
        pizza = new DoubleExtra(pizza,"Chili",3.2);
        pizza = new DoubleExtra(pizza,"Meat",7);
        pizza = new RegularExtra(pizza,"Pineapple",3);
        pizza = new NoExtra(pizza,"Cheese",3);

        //when
        double fullPrice = pizza.getPrice();
        String allIngredients = pizza.getLabel();

        //then
        assertThat("Hawaii pizza, Double Chili, Double Meat, Pineapple, Cheese").isEqualTo(allIngredients);
        assertThat(46.73).isEqualTo(fullPrice);
    }
}
