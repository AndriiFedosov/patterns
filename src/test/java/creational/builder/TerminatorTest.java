package creational.builder;


import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminatorTest {

    private static final String EXPECTED_LASER_GUN = "LaserGun";
    private static final int EXPECTED_AMMO = 225;
    private static final String EXPECTED_MODEL = "T-800";
    private static final LocalDate DATE = LocalDate.of(2020, 5, 7);

    @Test
    public void should_create_terminator(){
        //given && when;
        Terminator terminator = Terminator.builder()
                .withAmmo(EXPECTED_AMMO)
                .withGun(EXPECTED_LASER_GUN)
                .withModel(EXPECTED_MODEL)
                .fromCreateDate(DATE)
                .build();
        //then
        assertThat(terminator.getAmmo()).isEqualTo(EXPECTED_AMMO);
        assertThat(terminator.getDateIn()).isEqualTo(DATE);
        assertThat(terminator.getGun()).isEqualTo(EXPECTED_LASER_GUN);
        assertThat(terminator.getModel()).isEqualTo(EXPECTED_MODEL);

    }


}
