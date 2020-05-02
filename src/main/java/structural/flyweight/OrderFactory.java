package structural.flyweight;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Getter
public class OrderFactory {
    private static Map<String, OrderType> orderTypes = new HashMap<>();

    public static OrderType getOrderType(String name, String description) {
        boolean isExist = orderTypes.containsKey(name);
        if (!isExist) {
            log.info("Order type [{}] is absent. Added new order type.", name);
            return orderTypes.put(name, OrderType.builder()
                    .name(name)
                    .description(description)
                    .build());
        }
        log.info("Order type [{}] is exist.", name);
        return orderTypes.get(name);
    }

    public static int getOrderTypesSize() {
        return orderTypes.size();
    }
}
