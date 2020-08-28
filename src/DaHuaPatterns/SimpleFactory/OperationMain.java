package DaHuaPatterns.SimpleFactory;

//简单工厂模式
public class OperationMain {
    public static void main(String[] args) throws Exception {
        Operation oper = OperationFactory.createOperate("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.GetResult();
        System.out.println(result);
    }
}
