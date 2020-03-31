package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("pear");
        list.add("orange");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
