package wrappersAndGenerics.homeWork.taskOne;

public class TaskOne {

    private static <T> void switchPositions( T[] array, int positionOne, int positionTwo){
        if (positionOne >= array.length){
            System.out.println("First element doesn't exist in the array");
            return;
        }
        if (positionTwo >= array.length){
            System.out.println("Second element doesn't exist in the array");
            return;
        }
        T firstElement = array[positionOne];
        T secondElement = array[positionTwo];

        array[positionOne] = secondElement;
        array[positionTwo] = firstElement;
    }

    private static <T> void printArray(T[] array){
        for (T element : array){
            System.out.print(element.toString() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] someStrings = {"123", "456", "789"};
        printArray(someStrings);
        switchPositions(someStrings,0,2);
        printArray(someStrings);
    }
}
