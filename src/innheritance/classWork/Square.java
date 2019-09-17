package innheritance.classWork;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    int getArea() {
        return a * a;
    }
}
