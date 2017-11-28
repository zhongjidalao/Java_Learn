package Day_11;

public class Demo {
    public static void main(String[] args){
        Single s1 = Single.getInstance();
        Single2 s2 = Single2.getInstance();
    }
}

class Single{
    //创建本类的对象
    private static Single s = new Single();

    //私有化构造函数
    private Single(){}

    //提供一个公共的方法获取本类的对象
    public static Single getInstance(){
        return s;
    }
}

class Single2{
    //声明本类的引用类型变量，但先不要创建本类的对象
    private static Single2 s;

    //私有化构造函数
    private Single2(){}

    //提供一个公共静态的方法获取本类的对象，获取之前判断是否以及创建了本类的对象，如果没有创建，那么先创建本类对象然后再返回
    public static Single2 getInstance(){
        if(s == null){
            s = new Single2();
        }
        return s;
    }
}