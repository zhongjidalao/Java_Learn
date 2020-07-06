package DesignPattern.AbstractFactoryPattern;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("实现Color接口，绘制绿色");
    }
}
