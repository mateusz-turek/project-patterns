package Base.Singleton;

public class SingletonII {

    private static final SingletonII SINGLETON_II = new SingletonII();

    private SingletonII() {
    }

    public static SingletonII getInstance() {
        return SINGLETON_II;
    }
}
