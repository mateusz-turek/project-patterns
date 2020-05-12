package Base.CommandPatterns.State;

public class WalkState implements DogState {


    @Override
    public void next(Dog dog) {
        dog.setState(new SitState());
    }

    @Override
    public void prev(Dog dog) {
        dog.setState(new BarkState());
    }

    @Override
    public void printStatus() {
        System.out.println("Dog is walking");
    }
}