package collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("orange", 1);
//        map.put("apple", 2);
//        map.put("pear", 3);
//
//        for (String key : map.keySet()){
//            System.out.println(key);
//        }
        //TreeMap里支持已经重写compare的，比如String，Integer，如果需要自定义类型，就要重写compare
        Map<Student1, Integer> map = new TreeMap<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 p1, Student1 p2) {
                if (p1.score == p2.score){
                    return 0;
                }
                return p1.score > p2.score ? -1 : 1;
            }
        });

        map.put(new Student1("Tom", 77), 1);
        map.put(new Student1("Bob", 66), 2);
        map.put(new Student1("Lily", 99), 3);

        for (Student1 key : map.keySet()){
            System.out.println(key);
        }
        System.out.println(map.get(new Student1("Bob", 66)));
    }
}

class Student1 {
    public String name;
    public int score;

    Student1(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return String.format("{%s: score=%d}", name, score);
    }
}