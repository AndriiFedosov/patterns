package structural.bridge.devices;

import lombok.extern.slf4j.Slf4j;
import structural.bridge.Device;

@Slf4j
public abstract class BaseDevice implements Device {

    private Boolean on = false;
    private Integer volume = 1;
    private Integer chanel = 1;
    private DeviceType type;

    @Override
    public Boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public Integer getChannel() {
        return chanel;
    }

    @Override
    public void setChannel(Integer channel) {
        this.chanel = channel;
    }


    @Override
    public void getStatus() {
        log.info("Device type: " + type);
        log.info(type + " is :" + on);
        log.info("Chanel is: " + chanel);
        log.info("Volume : " + volume);
    }

    @Override
    public String getType() {
        return type.toString();
    }

    void setType(DeviceType type) {
        this.type = type;
    }
}
