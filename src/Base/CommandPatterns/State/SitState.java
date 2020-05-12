package Base.CommandPatterns.State;
public class SitState implements DogState {


    @Override
    public void next(Dog dog) {
        dog.setState(new BarkState());
    }

    @Override
    public void prev(Dog dog) {
        dog.setState(new WalkState());
    }

    @Override
    public void printStatus() {
        System.out.println("Dog sits calmly");
    }
}