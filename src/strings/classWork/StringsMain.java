package strings.classWork;

public class StringsMain {

    public static void main(String[] args) {
        System.out.println("new string");
        System.out.println(new Integer(500));
        System.out.println(new MyClass(22));
        System.out.println(new MyClass());
    }
}

class MyClass {
    private int a = 10;

    public MyClass() {
    }

    public MyClass(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "My Class: a = " + a;
    }
}
