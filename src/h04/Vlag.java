package h04;

import java.applet.Applet;
import java.awt.*;
public class Vlag extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        g.drawRect(100,150,8,150);
        g.drawRect(100,150,120,20);
        g.setColor(Color.red);
        g.fillRect(100,150,120,20);
        g.drawRect(100,170,120,20);
        g.setColor(Color.white);
        g.fillRect(100,170,120,20);
        g.drawRect(100,190,120,20);
        g.setColor(Color.blue);
        g.fillRect(100,190,120,20);


    }
}
