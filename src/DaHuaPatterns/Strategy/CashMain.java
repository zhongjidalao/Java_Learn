package DaHuaPatterns.Strategy;

//策略模式
public class CashMain {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("正常收费");
        double a = cashContext.GetResult(33);
        System.out.println(a);
    }
}
