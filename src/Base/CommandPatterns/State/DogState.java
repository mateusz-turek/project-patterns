package Base.CommandPatterns.State;

public interface DogState {

    void next(Dog dog);
    void prev(Dog dog);
    void printStatus();

}