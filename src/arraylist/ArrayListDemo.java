package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
    int id;
    String name;
    double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{书号："+this.id+"书名："+this.name+"}";
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book)obj;
        return this.id == book.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new Book(110,"JAVA编程思想",86));
        list.add(new Book(112,"JAVA核心技术",64));
        list.add(new Book(110,"JAVA神书",86));
        list.add(new Book(114,"代码重构",32));

        ArrayList newList = clearRearRepeat(list);
        System.out.println(newList);

        //定义一个函数清除集合中的重复元素，书号一致则为同一本书
    }
    public static ArrayList clearRearRepeat(ArrayList OldList){
        //创建一个新的集合对象
        ArrayList newList = new ArrayList();

        //遍历旧集合的元素
        Iterator it = OldList.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(!newList.contains(book)){
                newList.add(book);
            }
        }
        return newList;
    }
}
