package Base.Prototype;

public class Prototype implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
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

