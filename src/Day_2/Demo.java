package Day_2;

public class Demo {
    public static void main(String[] args) {
        //int类型会舍弃小数点后面的数字
        int x = 6370;
        x = x / 1000 * 1000;
        System.out.println(x);
    }
}