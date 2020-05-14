package Base.StructuralPatterns.Decorator;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}
