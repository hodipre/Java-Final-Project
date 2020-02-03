package com.company;

import java.awt.*;
import javax.swing.*;

public class Bullet extends JFrame{
    double x, y;
    Color c;

    Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.fillOval((int)this.x, (int)this.y, 20, 20);
        Toolkit.getDefaultToolkit().sync();
    }
}