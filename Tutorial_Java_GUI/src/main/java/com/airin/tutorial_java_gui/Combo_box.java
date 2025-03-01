package com.airin.tutorial_java_gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JComboBox;
public class Combo_box extends JFrame implements ActionListener{
    String[] Animals = {"Monkey","Cat","dog"};
    JComboBox box = new JComboBox(Animals);
    public Combo_box () {
        box.addActionListener(this);
//        box.addItem("Kontol");
//        box.removeItem("Cat");
//        box.setEditable(true);
//        box.insertItemAt("Pig", 0);
        box.removeAllItems();
        this.add(box);
        this.setBounds(550, 200, 250, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== box) {
            System.out.println(box.getSelectedItem());
        }
    }
    public static void main(String[] args) {
        new Combo_box();
    }
    
}
