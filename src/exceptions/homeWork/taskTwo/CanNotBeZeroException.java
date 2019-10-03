package exceptions.homeWork.taskTwo;

public class CanNotBeZeroException extends Exception {
    public CanNotBeZeroException(String message) {
        super(message);
    }

    public CanNotBeZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
