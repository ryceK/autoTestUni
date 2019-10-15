package collections.classWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        ListIterator<String> iterator1 = list1.listIterator();

        List<String> list2 = new LinkedList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");

        Iterator<String> iterator2 = list2.iterator();

        while (iterator2.hasNext()){
            if (iterator1.hasNext()){
                iterator1.next();
            }
            iterator1.add(iterator2.next());
        }
        System.out.println(list1);

        iterator2 = list2.iterator();
        while (iterator2.hasNext()){
            iterator2.next();
            if (iterator2.hasNext()){
                iterator2.next();
                iterator2.remove();
            }
        }

        System.out.println(list2);
    }

}
