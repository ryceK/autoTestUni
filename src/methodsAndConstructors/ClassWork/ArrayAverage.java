package methodsAndConstructors.ClassWork;

import java.util.Random;

public class ArrayAverage {
    private int[] array;

    public ArrayAverage(int numberOfElements) {
        this.array = generateRandomArray(numberOfElements);
    }

    private static int[] generateRandomArray(int numberOfElements) {
        int[] result = new int[numberOfElements];
        System.out.print("The array of " + numberOfElements + " random elements is: ");
        for (int i = 0; i < numberOfElements; i++){
            result[i] = new Random().nextInt(99);
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return result;
    }

    public double getAverage(){
        double sum = 0;
        for (int x = 0; x < array.length; x++){
            sum += array[x];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println("The average value of the array is " + new ArrayAverage(6).getAverage());
    }
}
