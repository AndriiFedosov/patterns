package structural.decorator.extra;

import structural.decorator.Order;


public class RegularExtra extends Extra {

    public RegularExtra(Order order, String label, double price) {
        super(order, label, price);
    }

    @Override
    public Double getPrice() {
        return this.price + order.getPrice();
    }
}
