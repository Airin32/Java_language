package com.airin.tutorial_java_gui;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Slidder extends JFrame implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    Slidder (){
        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new JLabel("Jomok");
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main (String[] args){
        new Slidder();
    }
}
