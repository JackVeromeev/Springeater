package com.veromeev.springeater.screensaver;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


@Component
@Scope("prototype")
public abstract class ScreenSaverFrame extends JFrame {

    public ScreenSaverFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void repaintRandom() {
        Random random = new Random();
        setLocation(random.nextInt(1000) + 300, random.nextInt(500) + 300);
        getContentPane().setBackground(getColor());
        repaint();
    }

    public abstract Color getColor();
}
