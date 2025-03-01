package com.airin.tutorial_java_gui;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
public class GriddLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new GridLayout(3,3));
        String [] data = {"1","2","3","4","5","6","7","8","9","10","11"};
        for (int i=0; i<data.length; i++){
            frame.add(new JButton(data[i]));
        }
        frame.setVisible(true);
    }
}
