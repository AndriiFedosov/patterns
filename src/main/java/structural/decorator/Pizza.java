package structural.decorator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pizza implements Order {
    private String label;
    private Double price;
}
