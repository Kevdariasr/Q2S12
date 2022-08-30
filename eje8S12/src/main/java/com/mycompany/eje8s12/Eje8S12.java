package com.mycompany.eje8s12;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Eje8S12 {
JFrame k;
    
    Eje8S12(){
        k = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Estilo");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode ("Font");
        
        style.add(color);
        style.add(font);
        
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Rojo");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Azul");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Negro");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Verde");
        
        color.add(red);color.add(blue);color.add(black);color.add(green);
        
        JTree jt = new JTree (style);
        k.add(jt);
        k.setSize(400, 400);
        k.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new Eje8S12();
        
    }
}
