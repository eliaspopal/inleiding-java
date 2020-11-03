package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRoundRect(100,50,100,200,30,30);
        g.setColor(Color.red);
        g.fillOval(125,60,50,50);
        g.setColor(Color.orange);
        g.fillOval(125,120,50,50);
        g.setColor(Color.green);
        g.fillOval(125,180,50,50);
    }
}
