package org.example;

/* Programa Java que declare una variable B de tipo entero y asignarle un valor. A
continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.*/

import javax.swing.*;
import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroIngresado=scanner.nextInt();

        if (numeroIngresado >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

    }
}
