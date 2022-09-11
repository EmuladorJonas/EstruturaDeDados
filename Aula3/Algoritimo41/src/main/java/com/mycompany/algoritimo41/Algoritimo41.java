package com.mycompany.algoritimo41;

import javax.swing.JOptionPane;


public class Algoritimo41 {

    public static void main(String[] args) {
        
        String nt1, nt2, nt3, nt4;
        
        float n1, n2, n3, n4, md;
       
        
        nt1 = JOptionPane.showInputDialog("Entre com o 1° número: ");
        n1 = Float.parseFloat(nt1);
        
        nt2 = JOptionPane.showInputDialog("Entre com o 2° número: ");
        n2 = Float.parseFloat(nt2);
        
        nt3 = JOptionPane.showInputDialog("Entre com o 3° número: ");
        n3 = Float.parseFloat(nt3);
        
        nt4 = JOptionPane.showInputDialog("Entre com o 1° número: ");
        n4 = Float.parseFloat(nt4);
        
        md = (n1*1 + n2*2 + n3*3 + n4*4)/10;
        
        JOptionPane.showMessageDialog(null,"Média : " +md);
        
        
    }
}
