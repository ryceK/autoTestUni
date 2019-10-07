package wrappersAndGenerics.homeWork.taskThree;

public class TaskThreeMain {
    public static void main(String[] args) {
        Node<Circle> nc = new Node<>();
//        Node<Shape> ns = nc;                - Won't work because class inheritance is ignored in generics
        Node<? extends Shape> ns = nc;
    }
}
