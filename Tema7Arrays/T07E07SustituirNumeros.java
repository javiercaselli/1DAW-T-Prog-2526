package Tema7Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E07SustituirNumeros {
    public static void main(String[] args) {
        // Declaración de los Arrays
        int[] numeros = new int[100];

        // Inicializa Random
        Random rand = new Random();
        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);
        // Genera 20 números aleatorios y los almacena en el array correspondiente
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(0, 21);
        }
        // Muestra los numeros del array por pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        // Pide introducir los numeros por el que quieres cambiar
        System.out.println();
        System.out.println("Introduzca un número de los que se ha mostrado: ");
        int num = sc.nextInt();
        System.out.println("Introduzca un valor por el que quieras sustituirlo: ");
        int sust = sc.nextInt();

        // Sustituye
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) numeros[i] = sust;
        }

        // Si el numero coincide lo cambia y lo pone entre comillas, si no lo deja igual
        for (int numero : numeros)
            if (numero == sust) {
                System.out.print("\"" + numero + "\" ");
            } else {
                System.out.print(numero + " ");
            }

        sc.close();
    }
}