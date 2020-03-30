package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//PriorityQueue默认排序，必须实现Comparable接口
public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();

        q.offer("apple");
        q.offer("pear");
        q.offer("banana");

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

        //自定义User类型
        Queue<User> q1 = new PriorityQueue<>(new UserComparator());

        q1.offer(new User("bob", "A1"));
        q1.offer(new User("Alice", "A2"));
        q1.offer(new User("Boss", "V1"));

        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
    }
}

class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.number.charAt(0) == o2.number.charAt(0)){
            return o1.number.compareTo(o2.number);
        }
        if (o1.number.charAt(0) == 'V'){
            return -1;
        }else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "/" + number;
    }
}