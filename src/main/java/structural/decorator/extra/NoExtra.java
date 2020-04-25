package structural.decorator.extra;

import structural.decorator.Order;


public class NoExtra extends Extra {
    public NoExtra(Order order, String label, double price) {
        super(order, label, price);
    }

    @Override
    public Double getPrice() {
        return order.getPrice();
    }
}
