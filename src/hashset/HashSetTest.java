package hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Iterator;

class User{
    String userName;
    String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "{" +
                "用户名：'" + userName + '\'' +
                ", 密码：'" + passWord + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(passWord, user.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord);
    }
}

public class HashSetTest {
    public static void main(String[] args){
        HashSet users = new HashSet();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入用户名：");
            String userName = scanner.next();

            System.out.println("请输入密码：");
            String passWord = scanner.next();

            User user = new User(userName,passWord);

            if(users.add(user)){
                System.out.println("用户添加成功");
            }else{
                System.out.println("用户名与密码已存在");
            }

            //遍历HashSet
            for(Iterator it=users.iterator(); it.hasNext();){
                System.out.println(it.next());
            }
        }
    }
}
