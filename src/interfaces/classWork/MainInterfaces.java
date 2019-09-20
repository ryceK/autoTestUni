package interfaces.classWork;

public class MainInterfaces {
    public static void main(String[] args) {
        usePrinter(new MyPrinter(), "str1");
        usePrinter(new MyPrinter2(), "str2");
    }

    static void usePrinter(Printer printer, String str){
        printer.print(str);
    }
}
