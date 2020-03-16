package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Student s = new Student("小明", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("小明", s);
        Student target = map.get("小明");
        System.out.println(target == s);
        System.out.println(target.score);
        Student another = map.get("Bob");
        System.out.println(another);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 123);
        map1.put("pear", 456);
        System.out.println(map1.get("apple"));
        map1.put("apple", 789);
        System.out.println(map1.get("apple"));

        for (String key : map1.keySet()){
            Integer value = map1.get(key);
            System.out.println(key + "=" + value);
        }

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 123);
        map2.put("pear", 4567);
        map2.put("banana", 789);

        for (Map.Entry<String, Integer> entry : map2.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}

class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
