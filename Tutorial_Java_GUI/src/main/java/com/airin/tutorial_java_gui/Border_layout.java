package com.airin.tutorial_java_gui;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Border_layout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.MAGENTA);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setBounds(400, 200, 720, 480);
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        JPanel panel_4 = new JPanel();
        panel_1.setBackground(Color.red);
        panel_2.setBackground(Color.BLUE);
        panel_3.setBackground(Color.YELLOW);
        panel_4.setBackground(Color.CYAN);
        panel_1.setPreferredSize(new Dimension(100,100));
        panel_2.setPreferredSize(new Dimension(100,100));
        panel_3.setPreferredSize(new Dimension(100,100));
        panel_4.setPreferredSize(new Dimension(100,100));
        JPanel panel_5 = new JPanel();
        JPanel panel_6 = new JPanel();
        JPanel panel_7 = new JPanel();
        JPanel panel_8 = new JPanel();
        JPanel panel_9 = new JPanel();
        panel_5.setBackground(Color.black);
        panel_6.setBackground(Color.GREEN);
        panel_5.setLayout(new BorderLayout());
        panel_6.setPreferredSize(new Dimension(30,30));
        panel_5.add(panel_6,BorderLayout.NORTH);
        panel_7.setBackground(Color.ORANGE);
        panel_7.setPreferredSize(new Dimension(30,30));
        panel_8.setBackground(Color.blue);
        panel_8.setPreferredSize(new Dimension(30,30));
        panel_9.setBackground(Color.YELLOW);
        panel_9.setPreferredSize(new Dimension(30,30));
        frame.add(panel_1,BorderLayout.NORTH);
        frame.add(panel_2,BorderLayout.EAST);
        frame.add(panel_3,BorderLayout.SOUTH);
        frame.add(panel_4,BorderLayout.WEST);
        frame.add(panel_5,BorderLayout.CENTER);
        
        panel_5.add(panel_7,BorderLayout.SOUTH);
        panel_5.add(panel_8,BorderLayout.WEST);
        panel_5.add(panel_9,BorderLayout.EAST);
    }
}
