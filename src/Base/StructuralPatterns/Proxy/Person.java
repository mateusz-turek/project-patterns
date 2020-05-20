package Base.StructuralPatterns.Proxy;

public class Person implements Name {
    @Override
    public String getName() {
        return "sample name";
    }
}
