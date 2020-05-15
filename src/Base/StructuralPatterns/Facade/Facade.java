package Base.StructuralPatterns.Facade;

public class Facade {
    public final ShapeMaker shapeMaker;

    private static final Facade facade;

    static {
        facade = new Facade();
    }

    {
        shapeMaker = new ShapeMaker();
    }

    private Facade() {
    }

    public static Facade getInstance(){
        if (facade != null){
        return facade;
        }
        else {
            return new Facade();
        }
    }

}
