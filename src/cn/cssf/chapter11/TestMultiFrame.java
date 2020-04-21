package cn.cssf.chapter11;

import java.awt.*;

public class TestMultiFrame {
    public static void main(String args[]) {
        MyFrame2 f1 =
            new MyFrame2(100,100,200,200,Color.BLUE);
        MyFrame2 f2 =
            new MyFrame2(300,100,200,200,Color.YELLOW);
        MyFrame2 f3 =
            new MyFrame2(100,300,200,200,Color.GREEN);
        MyFrame2 f4 =
            new MyFrame2(300,300,200,200,Color.MAGENTA);
    }
}




class MyFrame2 extends Frame{
    static int id = 0;
    MyFrame2(int x,int y,int w,int h,Color color){
        super("MyFrame " + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
