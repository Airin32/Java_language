
package com.airin.tutorial_java_gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
class MyButton implements ActionListener{
       private JFrame frame = new JFrame();
       private JButton button = new JButton();
    MyButton(){
        this.frame.setVisible(true);
        this.frame.setTitle("Button");
        this.frame.setBounds(600, 100, 480, 720);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Button();
    }
    private void Button (){
        this.button.setVisible(true);
        this.button.setBounds(140, 160, 70, 70);
        this.button.setSize(100, 100);
        this.button.addActionListener(this);
        this.frame.add(button);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button){
            System.out.println("Kamu Tolol");
        }
    }
}
public class Buuton {
    public static void main(String[] args){
        new MyButton();
    }
}
