package Day_5;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 1, 8, 5, 9};
//        int max = getMax(arr);
//        int min = getMin(arr);
//
//        System.out.println(max);
//        System.out.println(min);

        //选择排序法
//        printArray(arr);
//        selectSort(arr);
//        printArray(arr);

        //冒泡排序法
        System.out.print("排序前：");
        printArray(arr);
        selectSort_2(arr);
        System.out.print("排序后：");
        printArray(arr);

    }

    //遍历数组功能
    public static void printArray(int[] arr){
        for( int x=0; x<arr.length; x++ ){
            if( x!=arr.length-1 ){
                System.out.print(arr[x]+",");
            }else{
                System.out.println(arr[x]);
            }
        }
    }

    //冒泡排序法
    public static void selectArray(int[] arr){
        for( int x=0; x<arr.length-1; x++ ){
            for( int y=0; y<arr.length-1-x; y++ ){
                if( arr[y]>arr[y+1] ){
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] arr){
        for( int x=0; x<arr.length-1; x++ ){
            for( int y=x+1; y<arr.length; y++ ){
                if( arr[x]>arr[y] ){
                    swap(arr,x,y);
                }
            }
        }
    }

    public static void selectSort_2(int[] arr){
        for(int x=0; x<arr.length-1; x++ ){
            int num = arr[x];
            int index = x;
            for( int y=x+1; y<arr.length; y++ ){
                if( num>arr[y] ){
                    num = arr[y];
                    index = y;
                }
            }
            if( index!=x ){
                swap(arr,x,index);
            }
        }
    }

    //换位功能
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //取数组最大值
//    public static int getMax(int[] arr){
//        int max = arr[0];
//        for( int x=0; x<arr.length; x++ ){
//            if( arr[x]>max ){
//                max = arr[x];
//            }
//        }
//        return max;
//    }

    //取数组最小值
//    public static int getMin(int[] arr){
//        int min = arr[0];
//        for( int x=0; x<arr.length; x++){
//            if( arr[x]<min ){
//                min = arr[x];
//            }
//        }
//        return min;
//    }
}