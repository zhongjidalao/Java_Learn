package DesignPattern.AbstractFactoryPattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现Shape接口，绘制一个长方形");
    }
}
