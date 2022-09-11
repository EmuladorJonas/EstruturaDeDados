package com.mycompany.algoritimo42;
import javax.swing.JOptionPane;

public class Algoritimo42 {

    public static void main(String[] args) {
        
        String a;
        float ang,rang;
        
        a = JOptionPane.showInputDialog("Entre com o angulo: ");
        ang = Float.parseFloat(a);
        
        rang = (float) ((ang*Math.PI)/180);
        
        JOptionPane.showMessageDialog(null,"Seno : " + String.format("%.3f", Math.sin(rang)));
        JOptionPane.showMessageDialog(null,"Cosseno : " + String.format("%.3f", Math.cos(rang)));
        JOptionPane.showMessageDialog(null,"Tangente : " + String.format("%.3f", Math.tan(rang)));
        
        JOptionPane.showMessageDialog(null,"CoSecante : " + String.format("%.3f", 1/Math.sin(rang)));
        JOptionPane.showMessageDialog(null,"Secante : " + String.format("%.3f", 1/Math.cos(rang)));
        JOptionPane.showMessageDialog(null,"Cotangente : " + String.format("%.3f", 1/Math.tan(rang)));
    }
}
