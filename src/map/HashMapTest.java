package map;

import java.util.HashMap;
import java.util.Objects;

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
                "ID:" + id +
                ", 姓名：" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return this.id==person.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class HashMapTest {
    public static void main(String[] args){
        HashMap<Person,String> map = new HashMap<Person,String>();
        map.put(new Person(110,"狗娃"),"001");
        map.put(new Person(110,"张三"),"002");
        System.out.println(map);
    }
}
