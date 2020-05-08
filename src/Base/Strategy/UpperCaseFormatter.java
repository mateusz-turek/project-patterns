package Base.Strategy;

public class UpperCaseFormatter implements ChangeText {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
