package classes.taskFour;

public class TaskFour {
    private static Rectangle createRectangle(int breadth, int length){
        Rectangle result = new Rectangle();
        result.breadth = breadth;
        result.length = length;
        return result;
    }

    private static void printResult(Rectangle rectangle){
        System.out.println("A recktangle with length " + rectangle.length + " and breadth " + rectangle.breadth + " has area = " + rectangle.getArea() + ";");
    }

    public static void main(String[] args){
        System.out.println("Doing Task 4: Write a program to print the area of two rectangles having sides (4, 5) and (5, 8) respectively by creating a class named 'Rectangle' with integer fields ‘length’ and ‘breadth’, and with a method named ‘getArea’ which returns the area");

        Rectangle rectangle1 = createRectangle(4,5);
        printResult(rectangle1);

        Rectangle rectangle2 = createRectangle(5,8);
        printResult(rectangle2);

        System.out.println();
    }
}
