package org.example;

/*17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
posiciones impare*/

public class diecisiete {
    public static void main(String[] args) {
        int i=0;
        int[] N={1,5,6,2,7};

        System.out.println("Su numero es: ");
        for(int numeros: N){
            System.out.print(numeros);
        }

        System.out.println("\n");
        System.out.println("NUMERO IMPAR:");
        for(i=0; i<N.length; i++){
            if(N[i] % 2 !=0){
                System.out.print(N[i]);
            }
        }
    }
}
