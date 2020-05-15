package Base.StructuralPatterns.Facade;

import Base.StructuralPatterns.Facade.Figures.Circle;
import Base.StructuralPatterns.Facade.Figures.Rectangle;
import Base.StructuralPatterns.Facade.Figures.Shape;
import Base.StructuralPatterns.Facade.Figures.Square;

public class ShapeMaker {

    private static final Shape circle;
    private static final Shape square;
    private static final Shape rectangle;

    static {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    ShapeMaker() {
    }

    public void drawCircle (){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
