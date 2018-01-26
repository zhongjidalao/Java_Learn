package LinkedList;

import java.util.LinkedList;

//扑克类
class Poker{
    String color;
    int num;

    public Poker(String color, int num) {
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return color + num;
    }
}

public class LinkedListTestTwo {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
    }
}