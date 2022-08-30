package com.mycompany.eje2s12;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class Eje2S12 {

    JFrame myFrame = null;
    
    private void test(){
        myFrame = new JFrame("JeditorPane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("Text/plain");
        myPane.setText("«Viajé, amé, perdí, confié y me traicionaron.»\n" +
"En una posada en tierra de nadie, un hombre se dispone a relatar, por primera\n" +
"vez, la auténtica historia de su vida. Una historia que únicamente él conoce y que ha\n" +
"quedado diluida tras los rumores, las conjeturas y los cuentos de taberna que le han\n" +
"convertido en un personaje legendario a quien todos daban ya por muerto: Kvothe...\n" +
"músico, mendigo, ladrón, estudiante, mago, héroe y asesino.\n" +
"Ahora va a revelar la verdad sobre sí mismo. Y para ello debe empezar por el\n" +
"principio: su infancia en una troupe de artistas itinerantes, los años malviviendo\n" +
"como un ladronzuelo en las calles de una gran ciudad y su llegada a una universidad\n" +
"donde esperaba encontrar todas las respuestas que había estado buscando.\n" +
"Atípica, profunda y sincera, El nombre del viento es una novela de aventuras,\n" +
"de historias dentro de otras historias, de misterio, de amistad, de amor, de magia y\n" +
"de superación, escrita con la mano de un poeta y que ha deslumbrado —por su\n" +
"originalidad y la maestría con que está narrada— a todos los que la han leído.");
        
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
    public static void main(String[] args) {
        
        new Eje2S12().test();
        
    }
}
