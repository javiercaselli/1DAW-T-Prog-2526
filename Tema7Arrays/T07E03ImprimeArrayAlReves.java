package Tema7Arrays;

import java.util.Scanner;

class T07E03ImprimeArrayAlReves {
    public static void main(String[] args) {
        // Declaración del array
        int[] numeros = new int[10];

        // Declaración Scanner
        Scanner sc = new Scanner(System.in);

        // Inserta 10 número enteros leidos de teclado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca un número entero: ");
            numeros[i] = sc.nextInt();
        }

        // Imprime el Array en orden inverso al de inserción
        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Cierre scanner
        sc.close();
    }
}