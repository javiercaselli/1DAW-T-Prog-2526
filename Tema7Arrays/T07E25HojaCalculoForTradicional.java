package Tema7Arrays;

import java.util.Random;

public class T07E25HojaCalculoForTradicional {
    public static void main(String[] args) {
        // Tabla
        int[][] hojaCalculo = new int[4][5];

        // Random
        Random rand = new Random();

        // Rellenamos la hoja de cálculo
        for (int fila = 0; fila < hojaCalculo.length; fila++) {
            for (int col = 0; col < hojaCalculo[0].length; col++) {
                hojaCalculo[fila][col] = rand.nextInt(100, 1000);
            }
        }

        // Variables de resultado
        int totalFila = 0;
        int totalColumnas[] = new int[hojaCalculo[0].length]; // Para almacenar las sumas de las columnas
        int total = 0;

        for (int fila = 0; fila < hojaCalculo.length; fila++) {
            totalFila = 0;
            for (int col = 0; col < hojaCalculo[0].length; col++) {
                System.out.printf("%7d", hojaCalculo[fila][col]);
                totalFila += hojaCalculo[fila][col]; // Suma a la fila actual
                total += hojaCalculo[fila][col]; // Suma al total absoluto
                totalColumnas[col] += hojaCalculo[fila][col]; // Suma a la columna actual
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
