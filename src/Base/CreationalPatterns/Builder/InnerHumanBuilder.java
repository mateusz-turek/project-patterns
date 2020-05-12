package Base.CreationalPatterns.Builder;

public class InnerHumanBuilder {

    private String name;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "InnerHumanBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static final class Builder{
        private String name;
        private int age;
        private double height;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age (int age){
            this.age = age;
            return this;
        }
        public Builder height (double height){
            this.height = height;
            return this;
        }

        public InnerHumanBuilder build(){
            if(name.isEmpty()){
                throw new IllegalStateException("Name cannot be empty");
            }
            if(age==0){
                throw new IllegalStateException("age cannot be 0");
            }

            InnerHumanBuilder human = new InnerHumanBuilder();
            human.name = this.name;
            human.age = this.age;
            human.height = this.height;

            return human;
        }
    }

}
