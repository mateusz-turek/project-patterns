package Base.StructuralPatterns.Decorator.Decorator;

import Base.StructuralPatterns.Decorator.Component;

public class ConcreteDecoratorA extends Decorator {

    private final char character = '@';

    public ConcreteDecoratorA(Component component) {
        super(component);
    }


    @Override
    public String getName() {
        return name ;
    }
    public String addChar(){
        getComponent().setName(name+character);
        return getComponent().getName();
    }
}
