package com.airin.tutorial_java_gui;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JOption {
    public static void main (String[] args){
        //JOptionPane.showConfirmDialog(null, "this is a useles information", "you are so stupid", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showConfirmDialog(null, "You Stupid i've tell dobn't click that's", "Kono Baka", JOptionPane.ERROR_MESSAGE);
//        int confirm = JOptionPane.showConfirmDialog(null, "Hello ", "hi", JOptionPane.INFORMATION_MESSAGE);
//        System.out.println(confirm);
        JFrame frame = new JFrame("Jokes");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        String Name = JOptionPane.showInputDialog(null, "What is Your Name", "name", JOptionPane.QUESTION_MESSAGE);
        JLabel label = new JLabel("Hello" + Name + "I Love You");
        label.setBounds(0, 0, 300, 300);
        frame.add(label);
        frame.setVisible(true);
    }
}
