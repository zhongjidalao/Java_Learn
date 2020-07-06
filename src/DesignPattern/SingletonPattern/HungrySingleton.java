package DesignPattern.SingletonPattern;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Worle!");
    }
}
