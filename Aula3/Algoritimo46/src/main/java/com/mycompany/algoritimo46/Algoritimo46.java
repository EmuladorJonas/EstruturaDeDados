/*
 Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o 
 novo saldo, considerando o reajuste de 1%.
 */

package com.mycompany.algoritimo46;

import javax.swing.JOptionPane;

public class Algoritimo46 {

    public static void main(String[] args) {
        
        String s;
        float sal, nsal;
        
        s = JOptionPane.showInputDialog("Entre com o salário: ");
        sal = Float.parseFloat(s);
        
        nsal = (float) (sal*1.01);
        
        JOptionPane.showMessageDialog(null,"O novo salário, com +1% é: " +nsal);
    }
}
