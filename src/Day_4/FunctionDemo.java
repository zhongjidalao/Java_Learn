package Day_4;

public class FunctionDemo {
    public static void main(String[] args) {
        //同样一个函数名，输入的数据不同，会自动调用不同的函数，这就是函数的重载。
        int sum1 = add(3,4);
        int sum2 = add(3,4,5);
        double sum3 = add(3.4,4.5);
        double sum4 = add(3.4,4.5,5.6);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }

    //函数重载，这些函数的函数名一样，返回值类型不一样，输入的数也不一样。
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b,int c){
        return a+b+c;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static double add(double a, double b,double c){
        return a+b+c;
    }
}