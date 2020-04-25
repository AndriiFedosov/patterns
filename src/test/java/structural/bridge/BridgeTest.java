package structural.bridge;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import structural.bridge.devices.BaseDevice;
import structural.bridge.devices.Radio;
import structural.bridge.devices.TVSet;
import structural.bridge.remote.AdvanceRemote;
import structural.bridge.remote.BaseRemote;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeTest {
    @Test(dataProvider = "deviceProvider")
    public void should_manipulate_radio_by_base_remote(BaseDevice device) {
        //given
        BaseRemote baseRemote = new BaseRemote(device);
        AdvanceRemote advanceRemote = new AdvanceRemote(device);

        //when
        baseRemote.increaseChanel();
        baseRemote.increaseVolume();

        //then
        assertThat(device.isEnabled()).isFalse();
        assertThat(device.getChannel()).isEqualTo(1);
        assertThat(device.getVolume()).isEqualTo(1);

        //when
        baseRemote.power();
        baseRemote.increaseChanel();
        baseRemote.increaseVolume();
        //then
        assertThat(device.isEnabled()).isTrue();
        assertThat(device.getChannel()).isEqualTo(2);
        assertThat(device.getVolume()).isEqualTo(2);

        baseRemote.decreaseVolume();
        baseRemote.decreaseChanel();

        //then
        assertThat(device.getChannel()).isEqualTo(1);
        assertThat(device.getVolume()).isEqualTo(1);

        //when
        baseRemote.increaseVolume();
        baseRemote.increaseVolume();
        baseRemote.increaseVolume();
        baseRemote.increaseVolume();

        //then
        assertThat(device.getVolume()).isEqualTo(5);

        //when
        advanceRemote.mute();

        //then
        assertThat(device.getVolume()).isEqualTo(0);
    }

    @DataProvider
    public Object[][] deviceProvider() {
        return new Object[][]{{new Radio()}, {new TVSet()}};

    }
}
