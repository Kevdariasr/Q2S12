package com.mycompany.eje6s12;
import javax.swing.*;

public class Eje6S12 {

    Eje6S12(){
    JFrame F= new JFrame();
    DefaultListModel<String> K1 =new DefaultListModel<>();
    K1.addElement("Item 1");
    K1.addElement("Item 2");
    K1.addElement("Item 3");
    K1.addElement("Item 4");
    
    JList<String> list = new JList<>(K1);
    list.setBounds(100,100,75,75);
    
    F.add(list);
    F.setSize(400, 400);
    F.setLayout(null);
    F.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Eje6S12();
        
        
    }
}
