package exceptions.homeWork.taskTwo;

public class TaskTwo {
    private static int checkArg(int i) throws CanNotBeZeroException {
        if (i == 0){
            throw new CanNotBeZeroException(String.format("Input %s can't be 0", i));
        } else {
            return i;
        }
    }

    private static int handleArg(int i) throws IllegalArgumentException {
        try {
            checkArg(i);
            return i;
        } catch (CanNotBeZeroException e) {
            throw new IllegalArgumentException("Invalid input", e);
        }
    }

    public static void main(String[] args) {
        System.out.println(handleArg(1));
        System.out.println(handleArg(0));
    }
}
