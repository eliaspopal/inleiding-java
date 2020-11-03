package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawRoundRect(50,50,100,100,10,10);
        g.setColor(Color.black);

        g.fillRoundRect(70,70,20,20,30,30);
        g.fillRoundRect(110,70,20,20,30,30);
        g.fillRoundRect(70,110,20,20,30,30);
        g.fillRoundRect(110,110,20,20,30,30);
    }
}
