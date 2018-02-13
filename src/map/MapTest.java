package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        map.put("文章","马伊琍");
        map.put("霆锋","王菲");
        map.put("汪峰","章子怡");

        //遍历map
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key + map.get(key));
        }
    }
}
 