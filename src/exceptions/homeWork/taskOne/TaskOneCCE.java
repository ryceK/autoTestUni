package exceptions.homeWork.taskOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskOneCCE {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Map<String,Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap = (HashMap) integerList;
    }
}
