package innheritance.classWork;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int getArea() {
        return a * b;
    }
}
