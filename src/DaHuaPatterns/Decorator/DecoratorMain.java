package DaHuaPatterns.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮");

        BigTrouser bigTrouser = new BigTrouser();
        Tshirts tshirts = new Tshirts();

        bigTrouser.Decorate(xc);
        tshirts.Decorate(bigTrouser);
        tshirts.Show();
    }
}
