package DesignPattern.AbstractFactoryPattern;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("实现Color接口，绘制红色");
    }
}
