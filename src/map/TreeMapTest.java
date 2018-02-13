package map;

import java.util.Comparator;
import java.util.TreeMap;

class Emp implements Comparable<Emp>{
    String name;
    int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "姓名：'" + name + '\'' +
                ", 薪水：" + salary +
                '}';
    }

    @Override
    public int compareTo(Emp o) {
        return this.salary - o.salary;
    }
}

class AgeComparaTor implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.salary-o2.salary;
    }
}

public class TreeMapTest {
    public static void main(String[] args){
        TreeMap<Emp,String> tree = new TreeMap<Emp,String>();
        tree.put(new Emp("老汤",1000),"001");
        tree.put(new Emp("张三",800),"002");
        tree.put(new Emp("李四",9000),"003");
        tree.put(new Emp("王五",600),"004");

        System.out.println(tree);
    }
}
