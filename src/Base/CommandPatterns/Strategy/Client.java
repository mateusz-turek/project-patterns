package Base.CommandPatterns.Strategy;

public class Client {
    private static final String TEXT = "Strategy Design Pattern";

    public static void main(String[] args) {
        FormatterContext context = new FormatterContext();

        context.set(new UpperCaseFormatter());
        context.print(TEXT);

        context.set(new LowerCaseFormatter());
        context.print(TEXT);
    }
}
