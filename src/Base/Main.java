package Base;

import Base.Builder.InnerHumanBuilder;
import Base.Factory.Human;
import Base.Factory.HumanFactory;
import Base.Prototype.InnerPrototype;
import Base.Prototype.Prototype;
import Base.Prototype.PrototypeCreator;
import Base.Singleton.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
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

        System.out.println(sI == sII);
        System.out.println(sIIa == sIIb);
        System.out.println(singletonLazyLoadingI == singletonLazyLoadingII);

        SingletonMultiThreading.create();

        Object o = SingletonNoReflection.getInstance();
        Object o2 = SingletonNoReflection.getInstance();

        System.out.println(o);
        System.out.println(o2);
        System.out.println(o == o2);

        System.out.println("===========================Prototype=============================");
        System.out.println("Prototype pattern: " + "\n" +
                "Prototype - Declaration of cloneable interface" + "\n" +
                "class InnerPrototype extends Prototype -  implementation of WHOLE cloning process" + "\n" +
                "PrototypeCreator -  client requests the body of prototype in order to clone and create object based on it");
        Prototype tempPrototype;
        Prototype prototype = new InnerPrototype();
        PrototypeCreator prototypeCreator = new PrototypeCreator(prototype);

        tempPrototype = prototypeCreator.makePrototype();
        System.out.println(tempPrototype);

        System.out.println("===========================Builder=============================");
        InnerHumanBuilder ihb = new InnerHumanBuilder.Builder()
                .age(20)
                .name("Sample Name1")
                .height(1.80)
                .build();

        InnerHumanBuilder ihb2 = new InnerHumanBuilder.Builder()
                .age(10)
                .name("Sample Name2")
                .height(1.20)
                .build();

        System.out.println(ihb.toString());
        System.out.println(ihb2.toString());
        System.out.println(ihb==ihb2); //memory

        System.out.println("===========================Factory=============================");
        HumanFactory humanFactory = new HumanFactory();
        Human human = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tom | Kate");
        human = humanFactory.makeHuman(scanner.next());
        if (null!= human) {
            System.out.println(human);
            human.doStuff();
            scanner.close();
        }else {
            System.out.println("wrong input");
        }
    }
}
