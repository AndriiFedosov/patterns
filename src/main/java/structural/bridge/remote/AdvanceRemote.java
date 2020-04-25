package structural.bridge.remote;

import lombok.extern.slf4j.Slf4j;
import structural.bridge.devices.BaseDevice;

@Slf4j
public class AdvanceRemote extends BaseRemote {

    public AdvanceRemote(BaseDevice device) {
        super(device);
    }

    public void mute() {
        log.info("Mute device: [{}]", device.getType());
        device.setVolume(0);
    }
}
