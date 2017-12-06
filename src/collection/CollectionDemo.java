package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args){
        //创建一个集合对象
        Collection c = new ArrayList();
        //添加元素
        c.add(12);
        c.add("狗娃");
        c.add(3.14);
        System.out.println(c);

        Collection c2 = new ArrayList();
        c2.add("美美");
        c2.add("冰冰");
        //把c2中所有元素添加到c集合中
        c.addAll(c2);
        System.out.println(c);
    }
}
