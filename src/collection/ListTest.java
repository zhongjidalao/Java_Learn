package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("dog");
        list.add("apple");
        list.add(null);

        String second = list.get(3);

        System.out.println(second);

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        for(int i=0; i<list1.size(); i++){
            String s = list1.get(i);
            System.out.println(s);
        }

        //迭代器方式遍历List
        for(Iterator<String> it = list1.iterator(); it.hasNext(); ){
            String s = it.next();
            System.out.println(s);
        }

        //for each自带遍历
        for (String s : list1){
            System.out.println(s);
        }
    }
}
