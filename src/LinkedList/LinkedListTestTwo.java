package LinkedList;

import java.util.LinkedList;

//扑克类
class Poker{
    String color;
    String num;

    public Poker(String color, String num) {
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return color+num;
    }
}

public class LinkedListTestTwo {
    public static void main(String[] args){
        LinkedList pokers = createPoker();
        System.out.println(pokers);
    }
    public static LinkedList createPoker(){
        LinkedList list = new LinkedList();

        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"方块","梅花","红桃","黑桃"};

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<colors.length; j++){
                list.add(new Poker(colors[j],nums[i]));
            }
        }
        return list; 
    }
}