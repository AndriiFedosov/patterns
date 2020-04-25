package creational.singleton;

public class Singleton {

    private static int countOfInstance;

    private Singleton() {
        countOfInstance++;
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static int getCountOfInstance() {
        return countOfInstance;
    }
}
