package com.mycompany.eje7s12;
import javax.swing.*;

public class Eje7S12 {

    JFrame f;
    Eje7S12(){
        f = new JFrame();
        String data [][]={ {"101","Sebas","670000"},
                           {"102","leo","780000"},
                           {"103","Maria","70000"}};
        
        String colum[]={"ID","Nombre","Salario"};
        JTable jt =new JTable(data,colum);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
     
     new Eje7S12();
        
    }
}
