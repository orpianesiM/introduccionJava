package org.example;

/*11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
muestra por pantalla la longitud y el área de la circunferencia.
12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
longitud de la hipotenusa según el teorema de Pitágoras.
14. Programa que calcula el volumen de una esfera.
15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.*/

import java.util.Scanner;

public class onceDoceTreceCatorceQuince {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Valor del radio de una circunferencia");
            System.out.println("2.Pasar de km a ms");
            System.out.println("3.Calcular Hipotenusa");
            System.out.println("4.Calcular volumen de una esfera");
            System.out.println("5.Calcular area de un triangulo");
            System.out.println("0.Salir");
            System.out.println("Ingrese una opción..");
            opcion = Integer.parseInt(reader.nextLine());
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    System.out.println("Ingrese una velocidad en Km: ");
                    int velocidad = Integer.parseInt(reader.nextLine());
                    float velocidadCalculada = (float)velocidad * 1000/3600;
                    System.out.println("Su kilometro pasado a ms: " + velocidadCalculada);
                    break;
                case 3:
                    System.out.println("Ingrese la longitud del cateto 1");
                    int cateto1 = Integer.parseInt(reader.nextLine());
                    System.out.println("Ingrese la longitud del cateto 2");
                    int cateto2 = Integer.parseInt(reader.nextLine());
                    int hipotenusa = cateto1*cateto1 + cateto2*cateto2;
                    System.out.println("Hipotenusa = " + hipotenusa);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }

        } while (opcion != 0);

    }
}
