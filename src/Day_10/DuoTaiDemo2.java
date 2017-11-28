package Day_10;

class A{
    public void a(){
        System.out.println("钓鱼");
    }
    public void b(){
        System.out.println("管理");
    }
}

class B extends A{
    public void a(){
        System.out.println("JAVA");
    }
}

public class DuoTaiDemo2 {
    public static void main(String[] args){
        A a = new B();
        a.a();
    }
}
