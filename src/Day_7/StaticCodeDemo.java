package Day_7;

class StaticCode{

    //构造代码块
    {
        System.out.println("Person run");
    }

    static {
        System.out.println("hahaha");
    }
    void show(){
        System.out.println("show run");
    }
}

public class StaticCodeDemo {
    public static void main(String[] args){
        new StaticCode().show();
    }
}