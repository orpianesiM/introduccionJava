package org.example;

/*  Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
variable C*/

public class uno {
    public static void main(String[] args) {

        int N=5;
        double A=4235;
        char C='m';

        System.out.println("C = " + C);
        System.out.println("A = " + A);
        System.out.println("N = " + N);
        System.out.println("Suma N+A = " + N+A);
        System.out.println("Resta N-A = " + (N-A));
        
        int numeroChar=C;
        System.out.println("numeroChar = " + numeroChar);
        
    }
}
