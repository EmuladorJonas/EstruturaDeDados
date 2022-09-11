package com.mycompany.appmath;

public class Appmath {

    public static void main(String[] args) {
        
        System.out.println("01: A raiz de 64 eh..: "+ Math.sqrt(64));
        
        System.out.println("02: A raiz com exp e log e real>int de 64 eh..: "+ Math.round(Math.exp(0.5*Math.log(64))));
        
        System.out.println("03: A raiz com exp e log e sem rea>lint de 64 eh..: "+ Math.exp(0.5*Math.log(64)));
        
        System.out.println("04: Formatação:  "+(String.format("%.3f",Math.sin((45*Math.PI/180)+0.00013))));
        
        System.out.println("05: Potencia com exp e log e formatar:  "+(String.format("%.3f",Math.exp(3*Math.log(8)+0.00000013))));
        
        System.out.println("06: Potencia com exp e log sem formatar:  "+Math.exp(3*Math.log(8)));
        
        System.out.println("07: Potencia com operador ** e formatar:  "+(String.format("%.3f",Math.exp(3*Math.log(8)))));
        
        System.out.println("08: Raiz Cubica:  "+Math.cbrt(8));
        
        System.out.println("09: 8 absoluto:  "+Math.abs(-8));
        
        System.out.println("10: 8 absoluto:  "+Math.abs(8));
        
        System.out.println("11: Convertendo 5.5 para inteiro:  "+Math.round(5.5));
        
        System.out.println("12: Convertendo 6.5 para inteiro:  "+Math.round(6.49));
        
        System.out.println("13: Convertendo 6.5 + 0.0001 para inteiro:  "+Math.round(6.5 + 0.0001));
        
        System.out.println("14: Convertendo 5.45 para inteiro:  "+Math.round(5.45));
        
        System.out.println("15: Convertendo 5.51 para inteiro:  "+Math.round(5.51));
        
        double a = 87;
        
        System.out.println("16: Convertendo 87 para real:  "+a );
        
        System.out.println("17: Convertendo 3/4 para inteiro:  "+Math.round((float)3/4));
        
        
    }
}
