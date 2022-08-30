package com.mycompany.eje1s12;
import javax.swing.*;
import java.awt.event.*;
public class Eje1s12 {

    Eje1s12 (){
      final JFrame f= new JFrame ("Pop up Menu");
      final JPopupMenu popupmenu = new JPopupMenu ("Edit");  
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        
        popupmenu.add(cut);popupmenu.add(copy);popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent e){
                popupmenu.show(f, e.getX(),e.getY());
            }
        }
       );
        
        f.add(popupmenu);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Eje1s12 ();
        
        
       
    }
}
