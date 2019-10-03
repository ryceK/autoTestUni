package exceptions.homeWork.taskOne;

public class TaskOneNPE {
    public static void main(String[] args) {
        x2Multiplyer(null);
    }
    static Integer x2Multiplyer(Integer input){
        return input * 2;
    }
}
