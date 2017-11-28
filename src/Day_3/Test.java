package Day_3;

public class Test {
    public static void main(String[] args) {
        //三元运算符
//        int x = 0,y;
//        y = (x>1)?100:200;
//        System.out.println("y="+y);

        //获取两个整数中较大的整数。
//        int a,b;
//        int max = a>b?a:b;

        //获取三个整数中较大的整数。
//        int o=1,p=2,q=3;
//        int temp = o>p?o:p;
//        int max2 = temp>q?temp:q;
//        System.out.println(max2);

        //1到100之间6的倍数
        for(int x =0; x<=100; x++){
            if( x%6==0 ){
                System.out.println(x);
            }
        }
    }
}