/*
 Antes de o racionamento de energia ser decretado, quase ninguém falava em
quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
fazer um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts gasta por uma residência e calcule. Imprima:
o valor em reais de cada quilowatt;
o valor em reais a ser pago;
o novo valor a ser pago por essa residência com um desconto de 10%.
 */

package com.mycompany.algoritimo48;

import javax.swing.JOptionPane;


public class Algoritimo48 {

    public static void main(String[] args) {
        
        String s, q;
        float sm, qnt, pre, vp, vd;
        
        s = JOptionPane.showInputDialog("Entre com o salário mínimo: ");
        sm = Float.parseFloat(s);
        
        q = JOptionPane.showInputDialog("Entre com a quantidade em KW: ");
        qnt = Float.parseFloat(q);
        
        pre = (float) sm/700;
        vp = (float) pre*qnt;
        vd = (float) (vp*0.9);
        
        JOptionPane.showMessageDialog(null,"Preço do KW: " +String.format("%.3f",pre)+ "\nValor a ser pago: " +String.format("%.3f",vp)+ "\nValor com desconto: " +String.format("%.3f",vd));
    }
}
