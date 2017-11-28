package Day_6;

class Person{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    void people(){
        System.out.println("这个人的姓名是："+name);
        System.out.println("这个人的年龄是"+age);
    }
}

public class PersonDemo{
    public static void main(String[] args){
        Person a = new Person();

        a.setAge(18);
        a.setName("张三");

        a.people();
    }
}