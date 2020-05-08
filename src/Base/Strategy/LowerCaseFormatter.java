package Base.Strategy;

public class LowerCaseFormatter implements ChangeText {

    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
