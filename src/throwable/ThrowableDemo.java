package throwable;

public class ThrowableDemo {
    public static void main(String[] args){
        div(4,0);
    }
    public static void div(int a,int b){
        int c = 0;
        try {
            c = a/b;
        }catch (ArithmeticException e){
            System.out.println("出错了。。。");
            System.out.println("toString:"+e.toString());
        }
    }
}
