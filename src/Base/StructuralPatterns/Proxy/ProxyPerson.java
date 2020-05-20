package Base.StructuralPatterns.Proxy;

public class ProxyPerson implements Name {
    private Person person;
    private int counter;

    @Override
    public String getName() {
        counter++;
        if (counter > 1){
            if (person == null){
                person = new Person();
            }
            return person.getName();
        }
        return "no names";
    }
}
