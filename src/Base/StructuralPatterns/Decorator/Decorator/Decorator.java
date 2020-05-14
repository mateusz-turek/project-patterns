package Base.StructuralPatterns.Decorator.Decorator;

import Base.StructuralPatterns.Decorator.Component;

public abstract class Decorator extends Component {

    private final Component component;

    public Decorator(Component c) {
        super(c.getName());
        this.component = c;
    }

    public Component getComponent() {
        return component;
    }
}
