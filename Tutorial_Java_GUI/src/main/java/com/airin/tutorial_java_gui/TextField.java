package com.airin.tutorial_java_gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class TextField extends JFrame implements ActionListener {
    JButton submit = new JButton();
    JTextField textfield = new JTextField();
    TextField(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        submit.setText("Submit");
        submit.setPreferredSize(new Dimension(100,100));

        textfield.setSize(300, 40);
        textfield.setFont(new Font(null,Font.ITALIC,20));
        textfield.setForeground(new Color(189,225,109));
        textfield.setPreferredSize(new Dimension(300,100));
        textfield.setBackground(Color.BLACK);
        submit.addActionListener(this);
        this.add(textfield);
        this.add(submit);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
            System.out.println("airin" + textfield.getText());
        }
    }
    public static void main(String[] args) {
        new TextField();
    }
}
