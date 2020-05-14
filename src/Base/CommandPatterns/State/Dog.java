package Base.CommandPatterns.State;

import java.util.ArrayList;

public class Dog {

    private DogState state = new WalkState();

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public DogState getState() {
        return state;
    }

    public void setState(DogState state) {
        this.state = state;
    }
}