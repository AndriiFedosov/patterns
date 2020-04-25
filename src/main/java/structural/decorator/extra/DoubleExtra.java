package structural.decorator.extra;

import structural.decorator.Order;

public class DoubleExtra extends Extra {

    public DoubleExtra(Order order, String label, double price) {
        super(order, label, price);
    }

    @Override
    public Double getPrice() {
        return (this.price * 2) + order.getPrice();
    }

    public String getLabel() {
        return order.getLabel() + ", Double " + this.label;
    }

}
