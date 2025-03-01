package com.airin.tutorial_java_gui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Labels extends JLabel{
        Labels(){
        Border border = BorderFactory.createLineBorder(Color.green,5);
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        frame.setVisible(true);
        frame.resize(720, 480);
        label.setText("Bro do you code??");
        label.setFont(new Font("MV Boli",Font.PLAIN,30));
        label.setForeground(Color.green);
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("musuh.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100, 100, 450, 250);
    }
}
