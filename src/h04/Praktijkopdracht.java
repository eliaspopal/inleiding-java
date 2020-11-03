package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawLine(50,50,150,50);
        g.drawString("Lijn",90,65);
        g.drawRect(50,80,100,50);
        g.drawString("Rechthoek",70,150);
        g.drawRoundRect(50,165,100,50,30,30);
        g.drawString("Afgeronde Rechthoek",40,235);
        g.setColor(Color.magenta);
        g.fillRect(200,80,100,50);
        g.setColor(Color.BLACK);
        g.drawOval(200,80,100,50);
        g.drawString("Gevulde rechthoek met ovaal",160,150);
        g.setColor(Color.magenta);
        g.fillOval(200,165,100,50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",210,230);
        g.drawOval(350,80,100,50);
        g.setColor(Color.magenta);
        g.fillArc(350,80,100,50,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",350,150);
        g.drawOval(370,165,50,50);
        g.drawString("Cirkel",380,230);

    }
}
