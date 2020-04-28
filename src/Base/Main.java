package Base;

import Base.Singleton.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("========================================SINGLETON========================================");

        SingletonI sI;
        SingletonI sII;
        SingletonII sIIa;
        SingletonII sIIb;
        SingletonLazyLoading singletonLazyLoadingI;
        SingletonLazyLoading singletonLazyLoadingII;

        sI = SingletonI.SINGLETON;
        sII = SingletonI.SINGLETON;

        sIIa = SingletonII.getInstance();
        sIIb = SingletonII.getInstance();

        singletonLazyLoadingI = SingletonLazyLoading.getInstance();
        singletonLazyLoadingII = SingletonLazyLoading.getInstance();

        System.out.println(sI);
        System.out.println(sII);
        System.out.println(sIIa);
        System.out.println(sIIb);
        System.out.println(singletonLazyLoadingI);
        System.out.println(singletonLazyLoadingII);

        System.out.println(sI==sII);
        System.out.println(sIIa==sIIb);
        System.out.println(singletonLazyLoadingI==singletonLazyLoadingII);

        SingletonMultiThreading.create();

        Object o = SingletonNoReflection.getInstance();
        Object o2 = SingletonNoReflection.getInstance();

        System.out.println(o);
        System.out.println(o2);
        System.out.println(o==o2);

    }
}