package classes.taskFour;

public class TaskFour {

    private static void printResult(Rectangle rectangle){
        System.out.println("A recktangle with length " + rectangle.getLength() + " and breadth " + rectangle.getBreadth() + " has area = " + rectangle.getArea() + ";");
    }

    public static void main(String[] args){
        System.out.println("Doing Task 4: Write a program to print the area of two rectangles having sides (4, 5) and (5, 8) respectively by creating a class named 'Rectangle' with integer fields ‘length’ and ‘breadth’, and with a method named ‘getArea’ which returns the area");

        Rectangle rectangle1 = new Rectangle(4,5);
        printResult(rectangle1);

        Rectangle rectangle2 = new Rectangle(5,8);
        printResult(rectangle2);

        System.out.println();
    }
}
