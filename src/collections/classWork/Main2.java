package collections.classWork;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("2");
        System.out.println(stringSet);

        Set<Item> items = new TreeSet<>();
        Item item1 = new Item("1",1);
        Item item2 = new Item("2",1);
        Item item3 = new Item("3",1);

        items.add(item1);
        items.add(item2);
        items.add(item3);

        System.out.println(items);


    }

}
