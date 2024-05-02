package gui;

import actions.KeyHandler;
import javax.swing.*;
public class Gui {

    JFrame frame;
    Draw d;
    
    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;
    
    
    public void create()
    {
    
        frame = new JFrame("Snake Game");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.addKeyListener(new KeyHandler());
        
        d = new Draw();
        d.setBounds(0,0,width,height);
        d.setVisible(true);
        frame.add(d);
        
        frame.requestFocus();
        frame.setVisible(true);
        
    
    
    }
    


    
}
