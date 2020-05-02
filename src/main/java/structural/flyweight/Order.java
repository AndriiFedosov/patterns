package structural.flyweight;

import lombok.Builder;

@Builder
public class Order {
    private String name;
    private String description;
    private OrderType orderType;

    public void buy() {
        orderType.buy(name);
    }

}
