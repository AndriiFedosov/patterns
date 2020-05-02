package structural.flyweight;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class FlyweightTest {
    private static final double ORDERS_TO_BUY = 100;
    private static final double ORDERS_TYPES = 2;

    @Test
    public void should_create_min_orders() {
        //given
        Market market = new Market();

        //when
        for (int i = 0; i < Math.floor(ORDERS_TO_BUY / ORDERS_TYPES); i++) {
            market.addOrder("Candy", "Chocolate candy");
            market.addOrder("Banana", "Banana");
        }

        //then
        assertThat(market.getOrders().size()).isEqualTo(100);
        assertThat(OrderFactory.getOrderTypesSize()).isEqualTo(2);

    }


}
