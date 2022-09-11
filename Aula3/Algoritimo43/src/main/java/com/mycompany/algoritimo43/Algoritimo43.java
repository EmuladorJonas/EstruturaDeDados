/* Entrar com um número e imprimir o logaritmo desse número na base 10. */

package com.mycompany.algoritimo43;

import javax.swing.JOptionPane;

public class Algoritimo43 {

    public static void main(String[] args) {
        String l;
        float log;
        
        l = JOptionPane.showInputDialog("Entre com o logaritimando: ");
        log = Float.parseFloat(l);
        
        log = (float) (Math.log(log)/Math.log(10));
        
        JOptionPane.showMessageDialog(null,"Logaritimo : " +log);
    }
}
