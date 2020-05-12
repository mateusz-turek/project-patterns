package Base.CreationalPatterns.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMultiThreading {

    private static volatile SingletonMultiThreading INSTANCE;

    public static SingletonMultiThreading getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonMultiThreading.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonMultiThreading();
                }
            }
        }
        return INSTANCE;
    }

    private static void getI() {

            Object o = SingletonMultiThreading.getInstance();
            System.out.println(o);

    }

    private static void getII () {

            Object o = SingletonMultiThreading.getInstance();
            System.out.println(o);

    }

    public static void create () {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(SingletonMultiThreading::getII);
        executorService.submit(SingletonMultiThreading::getI);
        executorService.shutdown();
    }
}

