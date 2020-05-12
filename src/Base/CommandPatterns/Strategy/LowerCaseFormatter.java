package Base.CommandPatterns.Strategy;

public class LowerCaseFormatter implements ChangeText {

    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
