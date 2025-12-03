package Tema7Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E07SustituirNumerosArray {
    public static void main(String[] args) {
        // Declaración de los Arrays
        String[] numeros = new String[100];

        // Inicializa Random
        Random rand = new Random();

        // Genera 20 números aleatorios y los almacena en el array correspondiente
        System.out.println("Lista original:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = String.valueOf(rand.nextInt(0, 21));
            System.out.print(numeros[i] + " ");
        }

        // Declara e inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Pide dos números por pantalla
        System.out.print("\n\nIntroduzca un número de los que se han mostrado: ");
        int numAntiguo = sc.nextInt();
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int numNuevo = sc.nextInt();

        // Sustituye
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i].equals(String.valueOf(numAntiguo))) numeros[i] = "\"" + String.valueOf(numNuevo) + "\"";
        }

        //Imprime
        for (String numero : numeros) System.out.print(numero + " ");

        // Cierra el scanner
        sc.close();
    }
}
