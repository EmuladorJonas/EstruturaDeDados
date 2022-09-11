/*
 Entrar com o número e a base em que se deseja calcular o logaritmo desse número e imprimi-lo.
 */

package com.mycompany.algoritimo44;

import javax.swing.JOptionPane;


public class Algoritimo44 {

    public static void main(String[] args) {
        
        String b, n;
        float log, bas, num;
        
        n = JOptionPane.showInputDialog("Entre com o logaritimando: ");
        num = Float.parseFloat(n);
        
        b = JOptionPane.showInputDialog("Entre com a base: ");
        bas = Float.parseFloat(b);
        
        log = (float) (Math.log(num)/Math.log(bas));
        
        JOptionPane.showMessageDialog(null,"Logaritimo de : " +num+ "Na base " +bas+ "é: " +log);
    }
}
