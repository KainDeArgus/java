public class INNException extends RuntimeException {
    public INNException(String INN) {
        super("INN " + INN + " does not exist");
    }
}
