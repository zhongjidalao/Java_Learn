package DesignPattern.SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        HungrySingleton object = HungrySingleton.getInstance();
        object.showMessage();
    }
}
