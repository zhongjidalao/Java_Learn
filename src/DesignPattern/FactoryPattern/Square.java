package DesignPattern.FactoryPattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("实现Shape接口，绘制正方形");
    }
}
