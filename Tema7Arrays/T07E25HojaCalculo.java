package Tema7Arrays;

import java.util.Random;

public class T07E25HojaCalculo {
    public static void main(String[] args) {
        // Tabla
        int[][] hojaCalculo = new int[4][5];

        // Random
        Random rand = new Random();

        // Rellenamos la hoja de cálculo
        for (int fila = 0; fila < hojaCalculo.length; fila ++) {
            for (int col = 0; col < hojaCalculo[0].length; col ++) {
                hojaCalculo[fila][col] = rand.nextInt(100, 1000);
            }
        }

        // Variables de resultado
        int totalFila = 0;
        int totalColumnas[] = new int [hojaCalculo[0].length]; // Para almacenar las sumas de las columnas
        int total = 0;
        int indiceCol = 0;

        for (int[] columna : hojaCalculo) {
            totalFila = 0;
            indiceCol = 0;
            for (int valor : columna) {
                System.out.printf("%7d", valor);
                totalFila += valor;                 // Suma a la fila actual
                total += valor;                     // Suma al total absoluto
                totalColumnas[indiceCol] += valor;  // Suma a la columna actual
                indiceCol++;                        // Actualiza el índice de la columna actual
            }
            System.out.printf("    |%7d", totalFila);
            System.out.println();
        }

        // Fila de totales
        System.out.println("--------------------------------------------------");
        
        // Totales de las columnas
        for (int totalcol : totalColumnas) {
            System.out.printf("%7d", totalcol);
        }

        // Total absoluto
        System.out.printf("    |%7d", total);

        
    }
}
