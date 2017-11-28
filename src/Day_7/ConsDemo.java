package Day_7;

class Person{
    private String name;
    private int age;

    //定义一个Person类的构造函数
    Person(){
        name = "baby";
        age = 1;
        System.out.println(name + ":" + age);
    }
    Person(String name){
        this.name = name;
    }
    Person(String name,int age){
        this(name);
        this.age = age;
    }
    
    public void speak(){
        System.out.println(name + ":" + age);
    }
}

public class ConsDemo {
    public static void main(String[] args) {
        //构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
        Person p = new Person("旺财",30);
        p.speak();
        Person p1 = new Person("旺财");
        p1.speak();
    }
}