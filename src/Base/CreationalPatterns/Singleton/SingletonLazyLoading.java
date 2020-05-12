package Base.CreationalPatterns.Singleton;

public class SingletonLazyLoading {


    private static SingletonLazyLoading INSTANCE;

    private SingletonLazyLoading() {
    }

    public static SingletonLazyLoading getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonLazyLoading();
        }
        return INSTANCE;
    }
}
