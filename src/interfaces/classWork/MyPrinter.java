package interfaces.classWork;

public class MyPrinter implements Printer {
    @Override
    public void print(String string) {
        System.out.println("Printing: " + string);
    }
}
