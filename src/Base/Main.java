package Base;

import Base.CommandPatterns.Interpreter.InterpreterPatternDemo;
import Base.CommandPatterns.State.Dog;
import Base.CreationalPatterns.Builder.InnerHumanBuilder;
import Base.CreationalPatterns.Factory.Human;
import Base.CreationalPatterns.Factory.HumanFactory;
import Base.CreationalPatterns.Prototype.InnerPrototype;
import Base.CreationalPatterns.Prototype.Prototype;
import Base.CreationalPatterns.Prototype.PrototypeCreator;
import Base.CreationalPatterns.Singleton.*;
import Base.CommandPatterns.Strategy.FormatterContext;
import Base.CommandPatterns.Strategy.LowerCaseFormatter;
import Base.CommandPatterns.Strategy.UpperCaseFormatter;
import Base.StructuralPatterns.Adapter.DataWriter;
import Base.StructuralPatterns.Adapter.Writer;
import Base.StructuralPatterns.Bridge.Color.Blue;
import Base.StructuralPatterns.Bridge.Color.Green;
import Base.StructuralPatterns.Bridge.Square;
import Base.StructuralPatterns.Composite.Composite;
import Base.StructuralPatterns.Composite.Department;
import Base.StructuralPatterns.Composite.FinancialDepartment;
import Base.StructuralPatterns.Composite.SalesDepartment;
import Base.StructuralPatterns.Decorator.Component;
import Base.StructuralPatterns.Decorator.ComponentImplementation.ConcreteComponent;
import Base.StructuralPatterns.Decorator.Decorator.ConcreteDecoratorA;
import Base.StructuralPatterns.Decorator.Decorator.Decorator;
import Base.StructuralPatterns.Facade.Facade;
import Base.StructuralPatterns.Flyweight.FlyweightPatternDemo;
import Base.StructuralPatterns.Proxy.Name;
import Base.StructuralPatterns.Proxy.Person;
import Base.StructuralPatterns.Proxy.ProxyPerson;

import java.sql.SQLOutput;
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
        System.out.println("===========================SingletonEndsHere=============================");

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
        System.out.println("===========================PrototypeEndsHere=============================");

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
        System.out.println("===========================BuilderEndsHere=============================");

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
        System.out.println("===========================FactoryEndsHere=============================");
        System.out.println("===========================Strategy=============================");
        FormatterContext format = new FormatterContext();
        format.set(new UpperCaseFormatter());
        assert human != null;
        format.print(human.getName());
        format.set(new LowerCaseFormatter());
        format.print(human.getName());
        System.out.println("===========================StrategyEndsHere=============================");
        System.out.println("===========================State=============================");
        Dog dog = new Dog();

        dog.printStatus();

        dog.nextState();
        dog.printStatus();

        dog.nextState();
        dog.printStatus();

        dog.nextState();
        dog.printStatus();
        System.out.println("===========================StateEndsHere=============================");
        System.out.println("===========================Adapter=============================");
        Writer writer = new DataWriter();
        writer.save("Super value");

        System.out.println("===========================AdapterEndsHere=============================");
        System.out.println("===========================Decorator=============================");
        ConcreteComponent component =  new ConcreteComponent("Name");
        System.out.println(component.getName());

        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        decoratorA.addChar();
        System.out.println(decoratorA.getComponent().getName());

        component = (ConcreteComponent) decoratorA.getComponent();
        System.out.println(component.getName());
        System.out.println("===========================DecoratorEndsHere=============================");

        System.out.println("===========================Facade=============================");
        Facade facade = Facade.getInstance();
        facade.shapeMaker.drawSquare();
        facade.shapeMaker.drawRectangle();
        facade.shapeMaker.drawCircle();
        System.out.println("===========================FacadeEndsHere=============================");

        System.out.println("===========================Composite=============================");
        Department salesDepartment = new SalesDepartment(
                1, "Sales department");
        Department financialDepartment = new FinancialDepartment(
                2, "Financial department");

        Composite headDepartment = new Composite(
                3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
        System.out.println("===========================CompositeEndsHere=============================");

        System.out.println("===========================Bridge=============================");
        Square square1 = new Square(new Blue());
        Square square2 = new Square(new Green());
        System.out.println(square1.draw());
        System.out.println(square2.draw());
        System.out.println("===========================BridgeEndsHere=============================");

        System.out.println("===========================Proxy=============================");
        Name name1 = new Person();
        System.out.println(name1.getName());
        System.out.println(name1.getName());

        name1 = new ProxyPerson();
        System.out.println(name1.getName());
        System.out.println(name1.getName());
        System.out.println("===========================ProxyEndsHere=============================");

        System.out.println("===========================Flyweight=============================");
        FlyweightPatternDemo.main(args);
        System.out.println("===========================FlyweightEndsHere=============================");

        System.out.println("===========================Interpreter=============================");
        InterpreterPatternDemo.main(args);
        System.out.println("===========================InterpreterEndsHere=============================");
    }
}
