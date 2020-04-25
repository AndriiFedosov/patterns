package creational.factory_method;

class Logistic {
    private Transport transport;

    static Logistic createLogistic(Class clazz) throws InstantiationException, IllegalAccessException {
        return new Logistic(clazz);
    }

    private Logistic(Class clazz) throws IllegalAccessException, InstantiationException {
        transport = Transport.createTransport(clazz);
    }

    void deliver() {
        transport.delivery();
    }

    String getDeliveryMessage() {
        return transport.getDeliveryMessage();
    }


}
