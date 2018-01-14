package hashset;

import java.util.LinkedList;

class Person2{
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "姓名：'" + this.name + '\'' +
                ", 年龄：" + this.age +
                '}';
    }
}

public class HashSetTest {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(new Person2("张三",19));
        list.add(new Person2("李四",9));
        list.add(new Person2("王五",25));
        list.add(new Person2("赵六",8));

        sort(list);
        System.out.println(list);
    }

    public static void sort(LinkedList list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                Person2 p1 = (Person2)list.get(i);
                Person2 p2 = (Person2)list.get(j);
                if(p1.age>p2.age){
                    list.set(i,p2);
                    list.set(j,p1);
                }
            }
        }
    }
}
