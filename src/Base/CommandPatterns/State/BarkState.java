package Base.CommandPatterns.State;

public class BarkState implements DogState {


    @Override
    public void next(Dog dog) {
        dog.setState(new WalkState());
    }

    @Override
    public void prev(Dog dog) {
        dog.setState(new SitState());
    }

    @Override
    public void printStatus() {
        System.out.println("Dog is barking loudly");
    }
}