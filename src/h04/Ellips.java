package h04;

import java.applet.Applet;
import java.awt.*;
public class Ellips extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(100,100,50,80,90,360);

    }
}
