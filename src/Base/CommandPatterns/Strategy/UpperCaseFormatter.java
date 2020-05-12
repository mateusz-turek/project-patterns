package Base.CommandPatterns.Strategy;

public class UpperCaseFormatter implements ChangeText {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
