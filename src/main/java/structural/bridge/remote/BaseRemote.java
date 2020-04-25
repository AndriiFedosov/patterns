package structural.bridge.remote;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import structural.bridge.Remote;
import structural.bridge.devices.BaseDevice;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Slf4j
@AllArgsConstructor
public class BaseRemote implements Remote {
    protected BaseDevice device;

    @Override
    public void power() {
        if (device.isEnabled()) {
            log.info("Device will be turn Off");
            device.disable();
        } else {
            log.info("Device will be turn On");
            device.enable();
        }
    }

    @Override
    public void increaseVolume() {
        changeSettings("Volume", device::setVolume, device::getVolume, 1);
    }

    @Override
    public void decreaseVolume() {
        changeSettings("Volume", device::setVolume, device::getVolume, -1);
    }

    @Override
    public void increaseChanel() {
        changeSettings("Chanel", device::setChannel, device::getChannel, 1);
    }

    @Override
    public void decreaseChanel() {
        changeSettings("Chanel", device::setChannel, device::getChannel, -1);

    }

    private void changeSettings(String logMessage, Consumer<Integer> setFunction, Supplier<Integer> getFunction, Integer variable) {
        String type = device.getType();
        if (device.isEnabled()) {
            log.info("Change [{}] of device : [{}]  on [{}]", logMessage, type, variable);
            setFunction.accept(getFunction.get() + variable);
        } else {
            log.info("Device [{}]  is off, first turn on this device.", type);
        }
    }
}
