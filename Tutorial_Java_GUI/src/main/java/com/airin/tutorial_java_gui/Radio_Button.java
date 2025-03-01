package com.airin.tutorial_java_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class Radio_Button extends JFrame implements ActionListener {
    JRadioButton pizza = new JRadioButton("Pizza");
    JRadioButton burger = new JRadioButton ("burger");
    JRadioButton Hotdogs = new JRadioButton ("Hotdogs");
    ButtonGroup buttongoup;
    Radio_Button (){
        Radio_Button_setter();
        this.add(this.pizza);
        this.add(this.burger);
        this.add(this.Hotdogs);
        buttongoup = new ButtonGroup();
        buttongoup.add(pizza);
        buttongoup.add(burger);
        buttongoup.add(Hotdogs);
        this.setSize(400, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.pizza){
            System.out.println("I Am order The Pizza");
        }else if (e.getSource() == this.burger){
            System.out.println("I AM order the Burger");
        }
        else if (e.getSource()== this.Hotdogs){
            System.out.println("I Am order Hotdogs");
        }
    }
    private void Radio_Button_setter (){
        this.pizza.addActionListener(this);
        this.burger.addActionListener(this);
        this.Hotdogs.addActionListener(this);
    }
    public static void main(String[] args) {
        new Radio_Button();
    }
    
}
