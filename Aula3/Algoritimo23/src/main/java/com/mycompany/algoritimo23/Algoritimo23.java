package com.mycompany.algoritimo23;
import javax.swing.JOptionPane;

public class Algoritimo23 {

    public static void main(String[] args) {
        
        int d, num;
        String a;
        
        a = JOptionPane.showInputDialog("Informe um número de 3 casa");
        num =(int) Float.parseFloat(a);
        
        d = (num%100)/10;
        
        JOptionPane.showMessageDialog(null, "O Algorítimo da casa das dezenas é: "+d);
    }
}
