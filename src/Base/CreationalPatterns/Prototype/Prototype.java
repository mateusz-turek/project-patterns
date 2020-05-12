package Base.CreationalPatterns.Prototype;

public class Prototype implements Cloneable {

    // Declaration of cloneable interface


    @Override
    protected Object clone() {
        try {
            //  longer
            //  Prototype clone = (Prototype) super.clone();
            //  return clone;
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }


}

