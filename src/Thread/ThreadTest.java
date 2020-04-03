package Thread;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("启动新线程！");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("启动新线程！");
    }
}
