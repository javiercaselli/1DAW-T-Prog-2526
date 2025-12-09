package Tema7Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E29BuscaTesoro {
    // Constantes
    private static final int NUM_FILAS = 4;
    private static final int NUM_COLS = 5;

    private static final String  VICTORIA = "V";
    private static final String DERROTA = "D";

    private static final String MINA = "*";
    private static final String TESORO = "€";


    /**
     * Método para crear el tablero. Inicializa el array e introduce en las coordenadas
     * correspondientes el tesoro y la mina.
     * 
     * @return Array bidimensional que representa el tablero listo para la partida.
     */
    public static String[][] inicializarTablero() {
        // Tablero
        String[][] tablero = new String[NUM_FILAS][NUM_COLS];

        // Random
        Random rand = new Random();

        // Mina
        int minaFila = rand.nextInt(0,NUM_FILAS);
        int minaCol = rand.nextInt(0, NUM_COLS);

        // Tesoro
        int tesoroFila = rand.nextInt(0,NUM_FILAS);
        int tesoroCol = rand.nextInt(0, NUM_COLS);
        while (tesoroFila == minaFila && tesoroCol == minaCol) {
            tesoroFila = rand.nextInt(0,NUM_FILAS);
            tesoroCol = rand.nextInt(0, NUM_COLS);
        }

        // Coloca el tesoro y la mina en las coordenadas correspondientes
        tablero[minaFila][minaCol] = MINA;
        tablero[tesoroFila][tesoroCol] = TESORO;

        // devuelve el tablero
        return tablero;
    }

    /**
     * Pinta en pantalla el tablero que se le pasa como parámetro
     * @param tablero El tablero de juego
     * @param esFinal Booleano que indica si es o no el tablero de final de partida, en cuyo caso
     * se pintaría también la localización de la mina y el tesoro.
     */
    public static void pintarTablero(String[][] tablero, boolean esFinal) {
        for (int fila = tablero.length -1; fila >= 0; fila--) {
            System.out.print(fila + "|");
            for (int col = 0; col < tablero[0].length; col++) {
                /* Si el tablero es el de final de partida lo pinto entero,
                sino, debo pintar las jugadas pero no la localizaciónde la mina y el tesoro */
                boolean condicion = (tablero[fila][col] != null); // Esto se tiene que cumplir siempre
                if (!esFinal) {
                    condicion = condicion && !TESORO.equals(tablero[fila][col]) && !MINA.equals(tablero[fila][col]); // Si no es final, no pinta el € ni el *
                }
                if (condicion) {
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

    }

    /**
     * Ejecuta un turno
     * @param tablero
     */
    public static String ejecutaTurno(String[][] tablero) {
        // Valor de retorno
        String respuesta = "";

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Pintar tablero
        pintarTablero(tablero, false);

        // Solicita coordenadas de la jugada
        System.out.println();
        System.out.print("Coordenada x: ");
        int coordX = sc.nextInt();
        System.out.print("Coordenada y: ");
        int coordY = sc.nextInt();

        // Comprobar jugada
        if (MINA.equals(tablero[coordY][coordX])) {
            // Hemos perdido
            respuesta = DERROTA;
        } else if (TESORO.equals(tablero[coordY][coordX])) {
            // Hemos ganado
            respuesta = VICTORIA;
        } else {
            tablero[coordY][coordX] = "X";
        }

        return respuesta;

    }

    public static void main(String[] args) {
        // Membrete
        System.out.println("¡BUSCA EL TESORO!");
        System.out.println();

        // Crear tablero
        String[][] tablero = inicializarTablero();

        // Ejecutar turno
        String respuesta = "";
        while (respuesta.equals("")) {
            respuesta = ejecutaTurno(tablero);
        }

        if (respuesta.equals(VICTORIA)) {
            System.out.println("ENHORABUENA, HAS GANADO!!!");
        } else {
            System.out.println("LO SIENTO, HAS PISADO LA MINA, HAS PERDIDO");
        }

        pintarTablero(tablero, true);
    }

}
