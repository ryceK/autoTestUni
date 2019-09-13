package methodsAndConstructors.ClassWork;

public class StudentsGroup {
    private static final int STUDENTS_MAX_COUNT = 3;
    private Student[] students;
    private int studentsCount;

    public StudentsGroup() {
        students = new Student[STUDENTS_MAX_COUNT];
    }

    void add(Student student){
        if (studentsCount >= STUDENTS_MAX_COUNT){
            System.out.println("Student can not be added");
            return;
        }
        students[studentsCount] = student;
        System.out.println("Student ws added, index = " + studentsCount);
        studentsCount++;
    }

    public static void main(String[] args) {
        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.add(new Student("name 1"));
        studentsGroup.add(new Student("name 2"));
        studentsGroup.add(new Student("name 3"));
        studentsGroup.add(new Student("name 4"));
    }
}
