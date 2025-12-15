package Examenes;

import java.util.Random;
import java.util.Scanner;

public class Examen20251210TresEnRaya {
    public static final int SIZE = 3;

    /**
     * Pinta el tablero.
     * 
     * @param tablero
     */
    public static void pintarTablero(String[][] tablero) {
        for (int fila = 0; fila < SIZE; fila++) {
            for (int col = 0; col < SIZE; col++) {
                if (col == 0) {
                    System.out.print(fila + " |");
                }
                if (tablero[fila][col] != null) {
                    System.out.print(" " + tablero[fila][col] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Pinta el borde inferior
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("---");
        }
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

    /**
     * Jugada ordenador
     * 
     * @param tablero
     */
    public static boolean turnoOrdenador(String[][] tablero) {
        // Jugada del ordenador
        Random rand = new Random();

        System.out.println("Turno del ordenador:");

        int fila = -1;
        int col = -1;
        do {
            // Genera las coordenadas de la jugada del ordenador
            fila = rand.nextInt(SIZE);
            col = rand.nextInt(SIZE);
        } while (!coordenadasValidas(tablero, fila, col));

        // Realiza la jugada (Asigna coordenadas)
        tablero[fila][col] = "X";

        // Pinta el tablero
        pintarTablero(tablero);

        // Comprueba victoria
        return comprobarVictoria(tablero, fila, col, "X");
    }

    public static boolean turnoJugador(String[][] tablero) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Turno del jugador:");
        int fila = -1;
        int col = -1;
        do {
            System.out.print("Introduzca coordenada de la fila (0..2): ");
            fila = sc.nextInt();
            System.out.print("Introduzca coordenada de la columna (0..2): ");
            col = sc.nextInt();

            // Comprueba validez
            if (!coordenadasValidas(tablero, fila, col)) {
                System.out.println("Coordenadas inválidas, introduzca nuevas coordenadas");
            }
        } while (!coordenadasValidas(tablero, fila, col));

        // Realiza la jugada (Asigna coordenadas)
        tablero[fila][col] = "O";

        // Pinta el tablero
        pintarTablero(tablero);

        // Comprueba victoria
        return comprobarVictoria(tablero, fila, col, "O");
    }

    /**
     * Comprueba que la casilla no esté ya ocupada.
     * 
     * @param tablero
     * @param fila
     * @param col
     * @return
     */
    public static boolean coordenadasValidas(String[][] tablero, int fila, int col) {
        return tablero[fila][col] == null;
    }

    /**
     * Comprueba si hemos hecho tablas (tablero lleno)
     * 
     * @param tablero
     * @return
     */
    public static boolean comprobarTablas(String[][] tablero) {
        boolean tablas = true;
        for (int fila = 0; fila < SIZE; fila++) {
            for (int col = 0; col < SIZE; col++) {
                if (tablero[fila][col] == null) {
                    tablas = false;
                }
            }
        }

        if (tablas) {
            // Informa de las tablas al usuario
            System.out.println();
            System.out.println("La partida ha finalizado en tablas");
        }

        // Devuelve la respuesta
        return tablas;
    }

    /**
     * Comprueba si hay victoria del ordenador o el humano
     * 
     * @param tablero
     * @param string
     */
    public static boolean comprobarVictoria(String[][] tablero, int fila, int col, String jugador) {
        return (comprobarVictoriaFilas(tablero, fila, jugador) || comprobarVictoriaCols(tablero, col, jugador)
                || comprobarDiagonales(tablero, jugador));
    }

    public static boolean comprobarDiagonales(String[][] tablero, String jugador) {
        boolean victoria = false;

        //victoria = jugador.equals(tablero[0][0]) && jugador.equals(tablero[1][1]) && jugador.equals(tablero[2][2]);
        victoria = comprobarDiagonal1(tablero, jugador);
        if (!victoria) {
            //victoria = jugador.equals(tablero[0][2]) && jugador.equals(tablero[1][1]) && jugador.equals(tablero[2][0]);
            victoria = comprobarDiagonal2(tablero, jugador);
        }

        return victoria;
    }

    /**
     * Comprobación de diagonal principal para cualquier tamaño de tablero
     * @param tablero
     * @param jugador
     * @return
     */
    private static boolean comprobarDiagonal1(String[][] tablero, String jugador) {
        int aciertos = 0;
        for (int i = 0; i < SIZE; i++) {
            if (jugador.equals(tablero[i][i])) aciertos++;
        }

        return (aciertos == SIZE);
    }

    /**
     * Comprobación de diagonal 2 para cualquier tamaño de tablero.
     * @param tablero
     * @param jugador
     * @return
     */
    private static boolean comprobarDiagonal2(String[][] tablero, String jugador) {
        int aciertos = 0;
        for (int i = 0; i < SIZE; i++) {
            if (jugador.equals(tablero[i][SIZE - 1 - i])) aciertos++;
        }
        return (aciertos == SIZE);
    }

    /**
     * Comprueba victoria a nivel de fila.
     * 
     * @param tablero
     * @param fila
     * @param jugador
     * @return
     */
    public static boolean comprobarVictoriaFilas(String[][] tablero, int fila, String jugador) {
        int aciertos = 0;
        for (int c = 0; c < SIZE; c++) {
            if (jugador.equals(tablero[fila][c])) {
                aciertos++;
            }
        }

        return (aciertos == SIZE);
    }

    /**
     * Comprueba la victoria a nivel de columna.
     * 
     * @param tablero
     * @param col
     * @param jugador
     * @return
     */
    public static boolean comprobarVictoriaCols(String[][] tablero, int col, String jugador) {
        int aciertos = 0;
        for (int f = 0; f < SIZE; f++) {
            if (jugador.equals(tablero[f][col])) {
                aciertos++;
            }
        }

        return (aciertos == SIZE);
    }

    public static void main(String[] args) {
        System.out.println("TRES EN RAYA");
        System.out.println("------------");
        System.out.println();

        // Tablero
        String[][] tablero = new String[SIZE][SIZE];

        // El juego se desarrolla hasta que se completa el tablero o alguien gana
        int turno = 0;
        boolean victoria = false;
        while (!victoria && !comprobarTablas(tablero)) {
            if (turno == 0) { // Ordenador
                victoria = turnoOrdenador(tablero);
                turno = 1;
                if (victoria)
                    System.out.println("Lo siento, ha ganado el ordenador...");
            } else { // humano
                victoria = turnoJugador(tablero);
                turno = 0;
                if (victoria)
                    System.out.println("Enhorabuena, has ganado!!");
            }
        }
    }
}
