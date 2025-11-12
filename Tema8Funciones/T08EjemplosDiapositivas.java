package Tema8Funciones;

import java.util.Scanner;

public class T08EjemplosDiapositivas {
    
    /**
     * Función que determina si un número es par.
     * @param numero El número a evaluar.
     * @return true si el número es par, false si es impar.
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        if (esPar(numero)) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
    }
}
