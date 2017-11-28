package Day_5;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //遍历数组
//        for( int i=0; i<arr.length; i++){
//            System.out.println("第"+i+"个元素是："+arr[i]);
//        }
        //反向遍历
        for( int i=arr.length-1; i>=0; i--){
            System.out.println("第"+i+"个元素是："+arr[i]);
        }
    }
}