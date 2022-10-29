package gui;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    private int number;

    public Tile(int number) {
        this.number = number;
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        setOpaque(false);
        
    }

    @Override
    public void paintComponent(Graphics g) {
        if (number != 0) {
            g.setColor(Color.white);
            g.drawString(String.valueOf(number), getWidth() / 2, getHeight() / 2);
        }
    }
}
