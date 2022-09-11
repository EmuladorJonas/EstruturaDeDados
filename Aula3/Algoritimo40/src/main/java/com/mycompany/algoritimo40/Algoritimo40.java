package com.mycompany.algoritimo40;
import javax.swing.JOptionPane;


public class Algoritimo40 {

    public static void main(String[] args) {
        
        String dividendo, divisor;
        int d, div, quo, res;
       
        
        dividendo = JOptionPane.showInputDialog("Entre com o Dividendo (inteiro): ");
        d = (int) Float.parseFloat(dividendo);
        
        divisor = JOptionPane.showInputDialog("Entre com o Divisor (inteiro): ");
        div = (int) Float.parseFloat(divisor);
        
        quo = d/div;
        res = d%div;
        
        JOptionPane.showMessageDialog(null,"\nDividendo: " +d+ "\nDivisor: " +div+ "\nQuociente: " +quo+ "\nResto: " +res);
        
    }
}
