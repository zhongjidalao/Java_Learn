package Thread;

public class ThreadTest1 implements Runnable{
    private int numbers = 20;

    @Override
    public void run() {
        while (numbers > 0) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + numbers-- + "张票");
        }
    }

    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1();
        new Thread(threadTest1, "小明").start();
        new Thread(threadTest1, "小红").start();
        new Thread(threadTest1, "小花").start();
    }
}
