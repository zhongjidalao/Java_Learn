package DaHuaPatterns.Factory;

//工厂模式
public class FactoryMain {
    public static void main(String[] args) {
        IFactory iFactory = new UndergraduateFactory();
        LeiFeng student = iFactory.CreateLeiFeng();
        student.BuyRice();
    }
}
