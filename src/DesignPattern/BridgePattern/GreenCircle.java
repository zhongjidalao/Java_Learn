package DesignPattern.BridgePattern;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("绿色：" + "radius:" + radius + "x:" + x + "y:" + y);
    }
}
