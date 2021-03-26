package org.example;

/* Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
cada una. A continuación realiza las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B*/ 

public class cuatro {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("CAMBIANDO VALORES..");
        
        int variableAuxiliar=b, variableAuxiliar2=d;
        b=c;
        d=variableAuxiliar;
        variableAuxiliar=a;
        a=variableAuxiliar2;
        c=variableAuxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        
    }
}
