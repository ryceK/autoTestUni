package classes.taskSix;

public class TaskSix {
    private static int readData(String order){
        int result = 0;
        try {
            do {
                System.out.println("Please enter the desired value for the " + order + " number");

                byte[] b = new byte[100];
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
        System.out.println("Doing Task 6: Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.");

        int x = readData("first");
        int y = readData("second");
        int z = readData("third");

        System.out.println("Average value of entered numbers is " + Average.average(x,y,z));
        System.out.println();
    }
}
