package com.mycompany.algoritimo25;
import javax.swing.JOptionPane;

public class Algoritimo25 {

    public static void main(String[] args) {
        
        int data, dia, mes, ano;
        String dta;
        
        dta = JOptionPane.showInputDialog("Informe a data no formato: DDMMAA: ");
        data = (int)Float.parseFloat(dta);
        
        dia = data/10000;
        mes = (data%10000)/100;
        ano = data%100;
        
        JOptionPane.showMessageDialog(null,"\nDIA: "+dia + "\nMÊS: "+mes +"\nANO: "+ano);
        
    }
}
