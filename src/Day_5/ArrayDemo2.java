package Day_5;

public class ArrayDemo2 {
    public static void main(String[] args) {
//        int[] arr = {4,6,7,2,5,7,8};
        int[] arr = {12,34,46,67,89,98};
        int index = getIndex(arr,46);
        System.out.println("index="+index);

    }

    //二分查找法
    public static int halfSearch(int[] arr,int key){
        int max,min,mid;
        min = 0;
        max = arr.length-1;
        mid = (max+min)/2;

        while( arr[mid]!=key ){
            if( key>arr[mid]){
                min = mid + 1;
            }else if( key<arr[mid]){
                max = mid - 1;
            }
            if(max<min){
                return -1;
            }
            mid = (max+min)/2;
        }
        return mid;
    }

    //折半查找
    public static int halfSearch_2(int[] arr,int key){
        int max,min,mid;
        min = 0;
        max = arr.length-1;

        while( min<=max ){
            mid = ( max+min )>>1;

            if( key>arr[mid] ){
                min = mid + 1;
            }else if( key<arr[mid]){
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    //数组常见功能：查找
    public static int getIndex(int[] arr,int key){
        for( int x=0; x<arr.length;  x++){
            if( arr[x]==key ){
                return x;
            }
        }
        return -1;
    }
}