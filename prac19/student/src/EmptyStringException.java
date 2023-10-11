public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("The string is empty");
    }
}