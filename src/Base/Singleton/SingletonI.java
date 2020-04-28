package Base.Singleton;

public class SingletonI {

    public static final SingletonI SINGLETON = new SingletonI();

    private SingletonI(){
        if (SINGLETON != null){
            throw new IllegalStateException("Already exist");
        }
    }

}
