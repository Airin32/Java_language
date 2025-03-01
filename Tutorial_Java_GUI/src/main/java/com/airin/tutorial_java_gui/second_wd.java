package com.airin.tutorial_java_gui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class second_wd {
    JFrame frame = new JFrame();
    JLabel Label = new JLabel("Hello!!");
    second_wd(){
        Label.setFont(new Font(null,Font.PLAIN,20));
        Label.setBackground(Color.BLUE);  
        Label.setBounds(0,0,100,100);
        frame.add(Label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
