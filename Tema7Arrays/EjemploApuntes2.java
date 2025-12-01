package Tema7Arrays;

import java.util.Scanner;

public class EjemploApuntes2 {
    public static void main(String[] args) {
        int[][] tablero = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int fila = 0; fila < tablero.length; fila++) {
            for(int col = 0; col < tablero.length; col++) {
                System.out.print("Introduzca valor para fila " + fila + ", columna " + col + ": ");
                tablero[fila][col] = sc.nextInt();
            }
        }

        for(int fila = 0; fila < tablero.length; fila++) {
            for(int col = 0; col < tablero.length; col++) {
                System.out.print(tablero[fila][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
