package com.airin.tutorial_java_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JCheckBox;


public class JCheckbox extends JFrame implements ActionListener {
    JCheckBox cek_box = new JCheckBox();
    JCheckbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        cek_box.setText("I'AM NOT STUPID");
        cek_box.addActionListener(this);
        this.add(cek_box);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cek_box){
            boolean true_false = cek_box.isSelected();
            if (true_false == true){
                System.out.println("You So Stupid");
            }else{
                System.out.println(true_false + "Sorry that's not true");
            }
        }
    }
    public static void main(String[] args) {
        new JCheckbox();
    }
}
