package com.mycompany.algoritimo26;
import javax.swing.JOptionPane;


public class Algoritimo26 {

    public static void main(String[] args) {
        int data, dia, mes, ano, tt;
        String dta;
        
        dta = JOptionPane.showInputDialog("Informe a data no formato: DDMMAA: ");
        data = (int)Float.parseFloat(dta);
        
        dia = data/10000;
        mes = (data%10000)/100;
        ano = data%100;
        tt = (mes*10000) + (dia*100) + ano;
        
        JOptionPane.showMessageDialog(null,"\nDIA: "+dia + "\nMÊS: "+mes +"\nANO: "+ano);
        JOptionPane.showMessageDialog(null,"Data em formato MMDDAA: " +tt);
    }
}
