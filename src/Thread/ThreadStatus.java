package Thread;

public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(() -> {
//            System.out.println("hello");
//        });
//        System.out.println("start");
//        t.start();
//        t.join();
//        System.out.println("end");

//        Thread t = new MyThread1();
//        t.start();
//        Thread.sleep(1);
//        t.interrupt();
//        t.join();
//        System.out.println("end");

        Thread t = new MyThread2();
        t.start();
        Thread.sleep(1000);
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n + "hello!");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join();
        }catch (InterruptedException e){
            System.out.println("interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
