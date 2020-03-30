package collection;

import java.util.LinkedList;
import java.util.Queue;

//队列的接口
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("apple");
        q.offer("pear");
        q.offer("banana");

        //获取队首元素并删除
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());

        //获取队首元素不删除
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}
