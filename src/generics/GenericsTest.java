package generics;

/*
 自定义泛型类：

自定义泛型类的格式：

 	class 类名<自定义的泛型>{

 	}

 泛型类要注意的事项：
 	1. 类上声明的自定义泛型的具体数据类型是在使用该类创建对象 的时候确定的。
 	2. 如果一个类已经声明了自定义泛型，该类在创建对象的时候没有指定自定义泛型的具体数据类型，那么默认则为Object类型。
 	3. 静态的方法不能使用类上声明的自定义泛型，如果需要使用自定义泛型只能在自己方法上声明。
 */

import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        for(int i=0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(str.toUpperCase());
        }
    }
}
