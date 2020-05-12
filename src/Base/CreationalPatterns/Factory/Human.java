package Base.CreationalPatterns.Factory;

public abstract class Human {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void walk (){
        System.out.println(name + " " + surname + " " + " is walking");
    }

    public void wave(){
        System.out.println(name + " " + surname + " " + " is waving");
    }

    public void laugh(){
        System.out.println(name + " " + surname + " " + " is laughing");
    }
    public void doStuff(){
        walk();
        wave();
        laugh();
    }
}
