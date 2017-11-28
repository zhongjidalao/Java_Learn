package Day_12;

class Demo extends Thread {
    private String name;
    Demo(String name){
        this.name = name;
    }
    public void run(){
        for(int x=0; x<10; x++){
            System.out.println(name+".......x="+x);
        }
    }
}
public class ThreadDemo{
    public static void main(String[] args){
        Demo d1 = new Demo("旺财");
        Demo d2 = new Demo("小强");

        d1.start();
        d2.start();
    }
}