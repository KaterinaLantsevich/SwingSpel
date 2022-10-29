package gui;

import app.GameLogic;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Window extends JFrame {

    public Window() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(600, 600));
        setLocationRelativeTo(null);
        GameLogic logic = new GameLogic();
        setLayout(new GridLayout(4,4));
        getContentPane().setBackground(Color.black);
        for (Tile[] tiles : logic.getTiles()) {
            for (Tile tile : tiles) {
                add(tile);
            }
        }

        setVisible(true);
    }
}
