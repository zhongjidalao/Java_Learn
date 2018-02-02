package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class Emp implements Comparable{
    String name;
    int age;
    int salary;

    public Emp(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "名字：'" + name + '\'' +
                ", 年龄：" + age +
                ", 薪水：" + salary +
                '}';
    }

    //排序
    @Override
    public int compareTo(Object o) {
        Emp e = (Emp)o;
        return this.salary - e.salary;
    }
}

//比较器（推荐使用）
class AgeComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Emp e1 = (Emp)o1;
        Emp e2 = (Emp)o2;
        return e1.age - e2.age;
    }
}

public class TreeSetTest {
    public static void main(String[] args){
        AgeComparator ageComparator = new AgeComparator();

        TreeSet tree = new TreeSet(ageComparator);

        tree.add(new Emp("张三",20,200));
        tree.add(new Emp("李四",42,100));
        tree.add(new Emp("王五",30,300));
        tree.add(new Emp("阿宝",18,500));

        System.out.println(tree);
    }
}
