package DaHuaPatterns.Proxy;

//代理模式
public class ProxyMain {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy proxy = new Proxy(jiaojiao);

        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }
}
