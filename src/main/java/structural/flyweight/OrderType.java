package structural.flyweight;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@Slf4j
public class OrderType {
    private String name;
    private String description;

    public void buy(String name) {
        log.info("Order:[{}] was buying.", name);
    }
}
