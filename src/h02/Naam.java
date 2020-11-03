package h02;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Naam extends Applet {
    public Naam() {
    }

    public void init() {
        this.setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Elias", 50, 60);
    }
}
