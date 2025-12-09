package Tema7Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E29BuscaTesoro {
    /**
     * Método para crear el tablero. Inicializa el array e introduce en las coordenadas
     * correspondientes el tesoro y la mina.
     * 
     * @return Array bidimensional que representa el tablero listo para la partida.
     */
    public static String[][] inicializarTablero() {
        // Tablero
        String[][] tablero = new String[4][5];

        // Random
        Random rand = new Random();

        // Mina
        int minaFila = rand.nextInt(0,4);
        int minaCol = rand.nextInt(0, 5);

        // Tesoro
        int tesoroFila = rand.nextInt(0,4);
        int tesoroCol = rand.nextInt(0, 5);
        while (tesoroFila == minaFila && tesoroCol == minaCol) {
            tesoroFila = rand.nextInt(0,4);
            tesoroCol = rand.nextInt(0, 5);
        }

        // Coloca el tesoro y la mina en las coordenadas correspondientes
        tablero[minaFila][minaCol] = "*";
        tablero[tesoroFila][tesoroCol] = "€";

        // devuelve el tablero
        return tablero;
    }

    /**
     * Dibuja el tablero y ejecuta un turno
     * @param tablero
     */
    public static void ejecutaTurno(String[][] tablero) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        for (int fila = tablero.length -1; fila >= 0; fila--) {
            System.out.print(fila + "|");
            for (int col = 0; col < tablero[0].length; col++) {
                if (tablero[fila][col] != null) {
                    System.out.print(tablero[fila][col] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%2s", "");
        for (int col = 0; col < (tablero[0].length * 2) - 1; col++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%2s", "");
        for (int col = 0; col < tablero[0].length; col++)
            System.out.print(col + " ");

        // Solicita coordenadas de la jugada
        System.out.println();
        System.out.print("Coordenada x: ");
        int coordX = sc.nextInt();
        System.out.print("Coordenada y: ");
        int coordY = sc.nextInt();

        // Comprobar jugada
        if ("*".equals(tablero[coordY][coordX])) {
            // Hemos perdido
            System.out.println("DERROTA");
        } else if ("€".equals(tablero[coordY][coordX])) {
            // Hemos ganado
            System.out.println("VICTORIA");
        } else {
            tablero[coordY][coordX] = "X";
        }

    }

    public static void main(String[] args) {
        // Membrete
        System.out.println("¡BUSCA EL TESORO!");
        System.out.println();

        // Crear tablero
        String[][] tablero = inicializarTablero();

        // Ejecutar turno
        while (true) {
            ejecutaTurno(tablero);
        }
    }

}
