package Base.CommandPatterns.Strategy;

public class FormatterContext {

    private ChangeText changeText;

    public void set(ChangeText changeText) {
        this.changeText = changeText;
    }

    public void print(String text) {
        String formattedText = changeText.format(text);
        System.out.println(formattedText);
    }
}
