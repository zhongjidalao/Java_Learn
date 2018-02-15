package swing;

import javax.swing.*;
import java.awt.*;

public class SwingTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setTitle("测试GUI");
            }
        });
    }
}

class SimpleFrame extends JFrame{
//    private static final int DEFAULT_WIDTH = 300;
//    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);

        Image img = new ImageIcon("/img/02.png").getImage();
        setIconImage(img);
    }
}
