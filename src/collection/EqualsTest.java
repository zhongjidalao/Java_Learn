package collection;

import java.util.ArrayList;
import java.util.List;

public class EqualsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("香蕉");
        list.add("苹果");
        list.add("菠萝");
        list.add("西红柿");

        //contains不是通过==判断，而是通过equals判断是否为相同的
        System.out.println(list.contains("香蕉"));
        System.out.println(list.contains("哈密瓜"));

        System.out.println(list.indexOf("苹果"));
        System.out.println(list.indexOf("哈密瓜"));
    }
}
