package IO;

public class Second extends First{
    public Second(){
        aMethod();
    }
    public void aMethod(){
        System.out.println("second");
    }

    public static void main(String[] args) {
        new Second();
    }
}

class First{
    public First(){

    }

    public void aMethod(){
        System.out.println("first");
    }
}