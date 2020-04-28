package Base.Singleton;

public class SingletonNoReflection {


    private SingletonNoReflection() {
        if (Holder.INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    public static SingletonNoReflection getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final SingletonNoReflection INSTANCE = new SingletonNoReflection();
    }
}

