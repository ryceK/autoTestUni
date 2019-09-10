package taskTwo;

public class TaskTwo {
    private static Student createStudent(int id, String name, String address, String phoneNumber){
        Student result = new Student();
        result.id = id;
        result.name = name;
        result.address = address;
        result.phoneNumber = phoneNumber;
        return result;
    }

    private static void printStudentData(Student student){
        System.out.println("ID: " + student.id + "; Name: " + student.name + "; Address: " + student.address + "; Phone number: " + student.phoneNumber + ";");
    }

    public static void main(String[] args){
        System.out.println("Doing Task 2: Assign and print the id, phone number and address of two students having names \"Sam\" and \"John\" respectively by creating two objects of class 'Student'.");

        Student sam = createStudent(1, "Sam", "Kirova 11", "911");
        printStudentData(sam);

        Student john = createStudent(2, "John", "Kirova 6a", "112");
        printStudentData(john);
    }


}
