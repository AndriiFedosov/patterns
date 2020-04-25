package creational.singleton;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    public void should_create_only_one_instance() throws ClassNotFoundException {
        //given
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        NotSingleton notSingleton = new  NotSingleton();
        NotSingleton notSingleton1 = new  NotSingleton();

        //when
        int countOfInstanceSingleton = Singleton.getCountOfInstance();
        int countOfInstanceNotSingleton = NotSingleton.getCountOfInstance();

        //then
        assertThat(countOfInstanceNotSingleton).isEqualTo(2);
        assertThat(countOfInstanceSingleton).isEqualTo(1);

    }

}
