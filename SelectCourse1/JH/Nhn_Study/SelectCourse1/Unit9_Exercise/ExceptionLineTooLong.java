package Unit9_Exercise;

public class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The string is too long");
    }
}
