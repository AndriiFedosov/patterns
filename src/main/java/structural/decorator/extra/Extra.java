package structural.decorator.extra;

import lombok.AllArgsConstructor;
import lombok.Data;
import structural.decorator.Order;

@Data
@AllArgsConstructor
public abstract class Extra implements Order {
    protected Order order;
    protected String label;
    protected double price;

    public abstract Double getPrice();

    public String getLabel() {
        return order.getLabel() + ", " + label;
    }
}
