package h04;

import java.applet.Applet;
import java.awt.*;
public class Staafdiagram extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(100,100,30,30);
        g.drawRect(100,130,30,30);
        g.drawRect(100,160,30,30);
        g.drawRect(100,190,30,30);
        g.drawRect(100,220,30,30);
        g.drawString("Jeroen",100,270);

        g.setColor(Color.green);
        g.drawRect(150,100,30,30);
        g.drawRect(150,130,30,30);
        g.drawRect(150,160,30,30);
        g.drawRect(150,190,30,30);
        g.drawString("Hans",150,270);

        g.setColor(Color.pink);
        g.drawRect(200,100,30,30);
        g.drawRect(200,130,30,30);
        g.drawString("Valerie",200,270);

        g.setColor(Color.BLACK);
        g.drawRect(50,30,30,30);
        g.drawString("= 20KG",100,50);


    }
}
