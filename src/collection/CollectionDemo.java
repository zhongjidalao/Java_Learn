package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args){
        Collection c = new ArrayList();
        c.add(12);
        c.add("狗娃");
        c.add(3.14);
        System.out.println(c);
    }
}
