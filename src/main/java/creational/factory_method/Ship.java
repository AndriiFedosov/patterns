package creational.factory_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ship implements Transport {
    private String message;


    public void delivery() {
        this.message = "We will deliver this package by sea or river.";
        log.info(message);
    }

    public String getDeliveryMessage() {
        return message;
    }
}
