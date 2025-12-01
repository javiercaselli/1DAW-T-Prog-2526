package Tema7Arrays;

import java.util.Scanner;

public class T07E05ArrayMaxMin {
    public static void main(String[] args) {
        // Declaración del array
        long[] numeros = new long[10];

        // Declaración variables max y min
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        // Declaración Scanner
        Scanner sc = new Scanner(System.in);

        // Inserta 10 número enteros leidos de teclado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca un número entero: ");
            numeros[i] = sc.nextInt();
        }

        // Busca maximo y mínimo
        for(long numero : numeros) {
            if (max < numero) max = numero;
            if (min > numero) min = numero;
        }

        // Imprimir
        System.out.println();
        System.out.println("El máximo es " + max + " y el mínimo es " + min);
        System.out.println();
         for(long numero : numeros) {
            System.out.print(numero);
            if (max == numero) System.out.print(" Máximo");
            if (min == numero) System.out.print(" Mínimo");
            System.out.println();
        }
       
        // Cierra el Scanner
        sc.close();

    }
}
