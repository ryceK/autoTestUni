package interfaces.classWork;

public class MyPrinter2 implements Printer {
    @Override
    public void print(String string) {
        System.out.println("Printing2: " + string);
    }
}
