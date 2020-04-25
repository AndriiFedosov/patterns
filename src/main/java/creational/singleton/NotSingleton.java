package creational.singleton;

public class NotSingleton {
    private static int countOfInstance;

    public NotSingleton() {
        countOfInstance++;
    }

    public static int getCountOfInstance() {
        return countOfInstance;
    }
}
