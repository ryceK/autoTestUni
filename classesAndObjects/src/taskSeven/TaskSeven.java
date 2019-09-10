package taskSeven;

public class TaskSeven {
    private static Employee createEmployee(String name, String address, int year, int salary){
        Employee employee = new Employee();
        employee.name = name;
        employee.address = address;
        employee.yearOfJoining = year;
        employee.salary = salary;
        return employee;
    }

    private static Rank determineRank(){
        Rank result = null;
        try {
            do {
                System.out.println("Before we start, please tell me whether you are a boss or employee.(Boss/employee)");

                byte[] b = new byte[100];
                int readByte = System.in.read(b);
                String input = new String(b).trim();
                if (readByte > 0) {
                    if (input.toUpperCase().equals(Rank.BOSS.toString())){
                        result = Rank.BOSS;
                    } else if (input.toUpperCase().equals(Rank.EMPLOYEE.toString())){
                        result = Rank.EMPLOYEE;
                    } else {
                        System.out.println("Unknown rank: " + input);
                    }
                } else {
                    System.out.println("Nothing was typed.");
                }
            } while (result == null);
            if (result.equals(Rank.BOSS)) {
                System.out.println("Please enter BOSS passoword");
                int someBytes = System.in.read(new byte[100]);
                System.out.println("Access granted!");
                System.out.println("Pss... Actually, any password entered by BOSS is correct. I don't want to hide anything from BOSS.");
            }
        } catch (Exception ex) {
            System.out.println("Some error occurred - " + ex.getMessage());
        }
        return result;
    }

    private static void printEmployeedata(Employee employee, Rank viewerRank){
        if (viewerRank.equals(Rank.BOSS)) {
            System.out.printf("%-32s %-32s %-32s %-32s\n", employee.name, String.valueOf(employee.yearOfJoining), employee.address, String.valueOf(employee.salary));
        } else {
            System.out.printf("%-32s %-32s %-32s %-32s\n", employee.name, employee.yearOfJoining, employee.address, "***");
        }
    }

    public static void main(String[] args){
        System.out.println("Doing Task 7: Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'");

        Employee alexander = createEmployee("Alexander", "Leinina str., 12,3", 1994, 20000);
        Employee maria = createEmployee("Maria", "Kirova str., 23, 77", 2000, 10000);
        Employee ilona = createEmployee("Ilona", "Nevskogo str., 1, 1", 1999, 15000);
        Rank viewerRank = determineRank();

        System.out.printf("%-32s %-32s %-32s %-32s\n","Name", "Year of joining", "Address", "Salary");

        printEmployeedata(alexander,viewerRank);
        printEmployeedata(maria,viewerRank);
        printEmployeedata(ilona,viewerRank);
    }

}
