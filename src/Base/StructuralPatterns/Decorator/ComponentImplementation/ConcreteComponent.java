package Base.StructuralPatterns.Decorator.ComponentImplementation;

import Base.StructuralPatterns.Decorator.Component;

public class ConcreteComponent extends Component {

    public ConcreteComponent(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
