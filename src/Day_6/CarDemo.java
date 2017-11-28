package Day_6;

class Car{
    int num;
    String color;

    void run(){
        System.out.println(num+"..."+color);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        //c就是一个类类型的引用变量，指向了该类的对象
        Car c = new Car();
        c.num = 4;
        c.color = "red";
        c.run();
    }
}