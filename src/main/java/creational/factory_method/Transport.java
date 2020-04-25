package creational.factory_method;

public interface Transport {

    static Transport createTransport(Class clazz) throws IllegalAccessException, InstantiationException {
        return (Transport) clazz.newInstance();
    }

    void delivery();

    String getDeliveryMessage();
}
