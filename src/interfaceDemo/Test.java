package interfaceDemo;

public class Test implements InterfaceDemo {
    @Override
    public int Dog() {
        return 1;
    }

    @Override
    public String Cat() {
        return "这是猫";
    }
}
