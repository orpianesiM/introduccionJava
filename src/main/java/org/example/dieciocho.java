package org.example;

import java.util.Scanner;

public class dieciocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese hora: ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Ingrese segundos: ");
        int segundos = scanner.nextInt();

        if (segundos >= 0 && segundos <= 59) {
            if (minutos >= 0 && minutos <= 59) {
                if (hora >= 0 && hora <= 23) {
                    System.out.println("\nHora: " + hora + "\nMinutos: " + minutos + "\nSegundos: " + segundos);
                } else {
                    System.out.println("\nLa hora introducida no es valida!");
                }
            } else {
                System.out.println("\nLos minutos introducidos no son válidos!");
            }
        } else {
            System.out.println("\nLos segundos introducidos no son válidos");
        }
    }
}
