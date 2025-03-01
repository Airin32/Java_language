package com.airin.tutorial_java_gui;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame{
        Frame(){
        this.setVisible(true); //membuat frame agar terlihat
        this.setSize(420,420); // mengatur ukuran frame
        this.setTitle("This Tutorial GUi For java"); // memberikan title pada Gui
        this.setResizable(true); // memungkinkan agar frame tidak bisa di resize
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("musuh.png");//membuat icon logo
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.black);
        }
}
