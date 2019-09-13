package methodsAndConstructors.ClassWork;

public class Rectangle {
    private int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a) {
        this(a, a);
    }

//    public static void main(String[] args){
//        Rectangle rectangle = new Rectangle(5,13);
//        Rectangle square = new Rectangle(5);
//
//        System.out.println("Area of the rectangle is: " + rectangle.getArea());
//        System.out.println("Perimeter of the rectangle is: " + rectangle.getPerimeter());
//        System.out.println("Area of the square is: " + square.getArea());
//        System.out.println("Perimeter of the square is: " + square.getPerimeter());
//    }

    public int getArea(){
        return a * b;
    }

    public int getPerimeter(){
        return (a + b) * 2;
    }

    String getType(){
        if (a == b){
            return "square";
        } else {
            return "rectangle";
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,13);
        Rectangle square = new Rectangle(5);

        System.out.println(rectangle.getType());
        System.out.println(square.getType());
    }

}
