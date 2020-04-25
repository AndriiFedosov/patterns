package structural.adapter;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {
    @Test
    public void should_return_fitted_shapes() {
        //given
        RoundPeg roundPeg = new RoundPeg(2);
        SquareHole squareHole = new SquareHole(3);
        Adapter adapter = new Adapter(squareHole, roundPeg);

        //when
        boolean result = adapter.canBeAdapted();
        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_not_fitted_shapes() {
        //given
        RoundPeg roundPeg = new RoundPeg(5);
        SquareHole squareHole = new SquareHole(3);
        Adapter adapter = new Adapter(squareHole, roundPeg);

        //when
        boolean result = adapter.canBeAdapted();
        //then
        assertThat(result).isFalse();
    }

}
