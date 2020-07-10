package DesignPattern.BridgePattern;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("红色：" + "radius:" + radius + "x:" + x + "y:" + y);
    }
}
