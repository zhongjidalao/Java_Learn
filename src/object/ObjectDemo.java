package object;

public class ObjectDemo {
    public static void main(String[] args){
        Object o = new Object();
        //完整类名 + @ + 哈希码
        System.out.println("toString："+o.toString());
    }
}
class UserName{
    String name;
    String password;
}