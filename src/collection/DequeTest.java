package collection;

import java.util.Deque;
import java.util.LinkedList;

//双端队列
public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerLast("C");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
