package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class User{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class IteratorDemo {
    public static void main(String[] args){
        Collection c = new ArrayList();
        c.add("王林");
        c.add("马云");
        c.add("赵薇");
        c.add("思聪");

        Iterator it = c.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        List li = new ArrayList();
    }
}
