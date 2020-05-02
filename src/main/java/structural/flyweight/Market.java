package structural.flyweight;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
@Getter
public class Market {
    private List<Order> orders;

    public Market() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(String name, String description) {
        OrderType type = OrderFactory.getOrderType(name, description);
        Order order = Order.builder().orderType(type).build();
        orders.add(order);
    }
}


