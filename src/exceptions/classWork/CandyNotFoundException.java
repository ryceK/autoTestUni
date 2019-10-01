package exceptions.classWork;

public class CandyNotFoundException extends Exception{
    public CandyNotFoundException(String msg) {
        super(msg);
    }

    public CandyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
