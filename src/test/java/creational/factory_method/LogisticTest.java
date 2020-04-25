package creational.factory_method;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LogisticTest {


    @Test
    public void should_deliver_package__by_each_type_of_transport() throws IllegalAccessException, InstantiationException {

        Logistic truckLogistic = Logistic.createLogistic(Truck.class);
        Logistic shipLogistic = Logistic.createLogistic(Ship.class);
        Logistic airplaneLogistic = Logistic.createLogistic(Airplane.class);

        truckLogistic.deliver();
        shipLogistic.deliver();
        airplaneLogistic.deliver();

        assertThat(truckLogistic.getDeliveryMessage()).isEqualTo("We will deliver this package by sea or river.");
        assertThat(shipLogistic.getDeliveryMessage()).isEqualTo("We will deliver this package by sea or river.");
        assertThat(airplaneLogistic.getDeliveryMessage()).isEqualTo("We will deliver this package by air.");
    }
}