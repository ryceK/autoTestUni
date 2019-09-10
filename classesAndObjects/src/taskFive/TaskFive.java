package taskFive;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import taskFour.Rectangle;

import javax.sound.midi.Receiver;
import java.rmi.server.ExportException;
import java.util.Scanner;

public class TaskFive {
    private static int readData(String side){
        int result = 0;
        try {
            do {
                System.out.println("Please enter the desired " + side);

                byte[] b = new byte[1000];
                int readByte = System.in.read(b);
                String input = new String(b).trim();
                if (readByte > 0) {
                    result = parseInput(input);
                } else {
                    System.out.println("Nothing was  typed.");
                }
                if (result == 0) {
                    System.out.println("You have entered wrong value: " + input + ". Please enter an integer.");
                }
            } while (result == 0);
        } catch (Exception ex) {
            System.out.println("Some error occurred - " + ex.getMessage());
        }
        return result;
    }

    private static int parseInput(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex){
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println("Doing Task 5: Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard");

        Area area = new Area();
        System.out.println("In order to calculate the area of a rectangle we need to collect some data.");
        area.setDim(readData("breadth"), readData("length"));
        System.out.println("The area of the rectangle with breadth " + area.breadth + " and length " + area.length + " is " + area.getArea());
    }
}
