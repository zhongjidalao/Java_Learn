package hashset;

import java.util.HashSet;

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "编号：" + this.id +
                ", 姓名：'" + this.name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return this.id == person.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Person> set = new HashSet<Person>();
        set.add(new Person(110,"小明"));
        set.add(new Person(119,"旺财"));
        set.add(new Person(110,"王小明"));
        set.add(new Person(220,"如花"));
        System.out.println(set);
    }
}
