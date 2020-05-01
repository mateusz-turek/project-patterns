package Base.Prototype;
    // create object by cloning prototype, client requests the body of prototype;

    public class PrototypeCreator {

        private Prototype prototype;

        public PrototypeCreator (Prototype prototype){
            this.prototype = prototype;
        }

        public Prototype makePrototype() throws CloneNotSupportedException {
            return (Prototype)prototype.clone();
        }
    }

