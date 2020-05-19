package Base.StructuralPatterns.Bridge;

import Base.StructuralPatterns.Bridge.Color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return  color.fill() + " " + "Square";
    }
}
