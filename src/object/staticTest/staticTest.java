package object.staticTest;

public class staticTest {
    static int i = 7;
}

class Incremental {
    static void increment() {
        staticTest.i++;
    }
}

class Test{
    public static void main(String[] args) {
        Incremental.increment();
        System.out.println(staticTest.i);
    }
}
