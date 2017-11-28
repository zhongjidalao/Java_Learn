package Day_10;

abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{
    void eat(){
        System.out.println("啃骨头");
    }
    void loookHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("吃鱼");
    }
    void catchMouse(){
        System.out.println("抓老鼠");
    }
}

public class DuoTaiDemo {
    public static void main(String[] args){
        //向上转型
        Animal a = new Cat();
        a.eat();
        //向下转型
        Cat c = (Cat)a;
        c.eat();
        c.catchMouse();
    }
}
