package com.mycompany.eje4s12;
import javax.swing.*;
public class Eje4S12 {

    public static void main(String[] args) {
        final JFrame f = new JFrame ("Contraseña ejemplo");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Contraseña:");
        l1.setBounds(20, 100, 80, 30);
        value.setBounds(100, 100, 100, 30);
        
        f.add(value); f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
