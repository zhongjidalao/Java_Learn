package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("xyz"));
        System.out.println(set.add("xyz"));

        System.out.println(set.contains("xyz"));
        System.out.println(set.contains("xYz"));
        System.out.println(set.remove("hello"));
        System.out.println(set.size());

        Set<String> set1 = new TreeSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("pear");
        set1.add("orange");
        for (String s : set1){
            System.out.println(s);
        }
    }
}
