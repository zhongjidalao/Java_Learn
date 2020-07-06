package DesignPattern.FactoryPattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("实现Shape，绘制一个圆形");
    }
}
