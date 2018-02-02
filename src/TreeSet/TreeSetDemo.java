package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        String str = "8 10 15 5 2 7";
        System.out.println(sortString(str));
    }

    public static String sortString(String str){
        TreeSet tree = new TreeSet();
        //切割字符串得到字符串数字
        String[] datas = str.split(" ");
        for(int i=0; i<datas.length; i++){
            int num = Integer.parseInt(datas[i]);
            tree.add(num);
        }

        //遍历TreeSet的元素
        StringBuilder sb = new StringBuilder();
        Iterator it = tree.iterator();
        while(it.hasNext()){
            sb.append(it.next()+" ");
        }
        return sb.toString();
    }
}
