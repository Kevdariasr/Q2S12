package com.mycompany.eje5s12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Eje5S12 extends JFrame implements ActionListener{

    JButton b;
    Container c;
    Eje5S12(){
        c= getContentPane();
        c.setLayout(new FlowLayout());
        b= new JButton("color");
        b.addActionListener(this);
        c.add(b);
        
    }
    public void actionPerformed(ActionEvent e){
      Color initialcolor= Color.RED;  
      Color color =JColorChooser.showDialog(this, "Seleccione un color", initialcolor);
      c.setBackground(color);
      
      
    } 
    public static void main(String[] args) {
        
        Eje5S12 f= new Eje5S12();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
