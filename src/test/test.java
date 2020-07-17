package test;

public class test {
    public static void main(String[] args){
        String a = stringToAscii("hello");
        String[] words = a.split(",");
        for (String word : words){
            int word1 = Integer.parseInt(word);
            System.out.println(word1);
        }
    }

    public static String stringToAscii(String value) {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                sbu.append((int)chars[i]).append(",");
            }
            else {
                sbu.append((int)chars[i]);
            }
        }
        return sbu.toString();
    }
}
