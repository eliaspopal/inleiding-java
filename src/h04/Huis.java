package h04;

import java.applet.Applet;
import java.awt.*;
public class Huis extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        g.drawRect(100,100,100,100);
        g.drawRect(120,150,20,50);
        g.drawLine(150,50,100,100);
        g.drawLine(150,50,200,100);
        g.drawRect(145,110,30,30);
    }
}
