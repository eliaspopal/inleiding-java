package h04;

import java.applet.Applet;
import java.awt.*;
public class Driehoek extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        g.drawLine(200,200,150,75);
        g.drawLine(200,200,300,100);
        g.drawLine(300,100,150,75);

    }
}
