package org.example;

/*Programa Java que lea un nombre y muestre por pantalla:
“Buenos días, {NOMBRE}”*/

import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre=reader.nextLine();
        System.out.println("Buenos Dias " + nombre);
    }
}
