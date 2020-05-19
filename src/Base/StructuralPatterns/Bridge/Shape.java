package Base.StructuralPatterns.Bridge;

import Base.StructuralPatterns.Bridge.Color.Color;

public abstract class Shape {

    protected Color color;

    abstract public String draw();

    public Shape(Color color) {
        this.color = color;
    }
}
