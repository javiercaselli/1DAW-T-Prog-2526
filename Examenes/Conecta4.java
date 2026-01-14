package Examenes;

import java.util.Random;
import java.util.Scanner;

public class Conecta4 {
    private static final int CONECTA_X = 4;
    private static final int NUM_FILAS = 6;
    private static final int NUM_COLUMNAS = 6;
    private static final String[] valores = {" ", "X", "O"};
    private static final int CASILLA_VACIA = 0;
    private static final int TURNO_ORDENADOR = 1;
    private static final int TURNO_HUMANO = 2;


    // Contador de jugadas para controlar el empate
    private static int contador = 0;

    public static void main(String[] args) {
        // tablero
        int[][] tablero  = new int[NUM_FILAS][NUM_COLUMNAS];

        // Membrete del juego
        System.out.println();
        System.out.println("CONECTA 4");
        System.out.println("---------");
        System.out.println();

        // Pintar tablero
        pintarTablero(tablero);

        // Desarrollo de la partida
        int turno = TURNO_ORDENADOR;
        boolean victoria = false;
        while (!victoria && contador < (NUM_COLUMNAS*NUM_FILAS)) {
            if (turno == TURNO_ORDENADOR) {
                victoria = turnoOrdenador(tablero);
                turno = TURNO_HUMANO;
                if (victoria) System.out.println("Lo siento, has perdido contra el ordandor");
            } else {
                victoria = turnoHumano(tablero);
                turno = TURNO_ORDENADOR;
                if (victoria) System.out.println("Enhorabuena, has ganado!!!");
            }
        }

        if (!victoria) System.out.println("La partida ha terminado en tablas");


    }

    /**
     * Pinta el tablero.
     *
     * @param tablero
     */
    private static void pintarTablero(int[][] tablero) {
        // Pintamos área principal del tablero
        for (int i = 0; i < NUM_FILAS; i++) {
            for (int j = 0; j < NUM_COLUMNAS; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                switch (tablero[i][j]) {
                    case CASILLA_VACIA:
                        System.out.print("   ");
                        break;
                    case TURNO_HUMANO:
                        System.out.print(" " + valores[TURNO_HUMANO] + " ");
                        break;
                    case TURNO_ORDENADOR:
                        System.out.print(" " + valores[TURNO_ORDENADOR] + " ");
                        break;
                    default:
                        System.out.print(" **** ERROR **** ");
                }
            }
            System.out.println();
        }

        // Pintamos la base del tablero
        System.out.print(" ");
        // Guiones de delimitación
        for (int i = 0; i < NUM_COLUMNAS; i++) {
            System.out.print("---");
        }
        System.out.println();

        // Índice de las columnas
        System.out.print(" ");
        for (int i = 0; i < NUM_COLUMNAS; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

    /**
     * Ejecución del turno del ordenador.
     * @param tablero
     */
    private static boolean turnoOrdenador(int[][] tablero) {
        // Generador de números aleatorios
        Random rand = new Random();

        // Genero un número de columna aleatoriamente hasta que dicha columna sea válida
        int columna = 0;
        do {
            columna = rand.nextInt(NUM_COLUMNAS);
        } while (!columnaValida(tablero, columna));

        hacerJugada(tablero, columna, TURNO_ORDENADOR);

        // Comprueba si el ordenador ha ganado tras esta jugada
        return comprobarVictoria(tablero, columna, TURNO_HUMANO);
    }

    /**
     * Ejecución del turno del humano.
     * @param tablero
     */
    private static boolean turnoHumano(int[][] tablero) {
        // Scanner para pedir al jugador humano la columna en la que desea jugar
        Scanner sc = new Scanner(System.in);

        // Genero un número de columna aleatoriamente hasta que dicha columna sea válida
        int columna = 0;
        do {
            System.out.print("Introduzca el número de columna deseada: ");
            columna = sc.nextInt();
            if (!columnaValida(tablero, columna)) {
                System.out.println("ERROR: La columna '" + columna + "' está llena, pruebe en otra.\n");
            }
        } while (!columnaValida(tablero, columna));

        hacerJugada(tablero, columna, TURNO_HUMANO);

        // Comprueba si el humano ha ganado tras esta jugada
        return comprobarVictoria(tablero, columna, TURNO_HUMANO);
    }


    /**
     * Inserta ficha en la columna seleccionada.
     *
     * @param tablero
     * @param columna
     * @param jugador
     */
    private static void hacerJugada(int[][] tablero, int columna, int jugador) {
        int i = 0;
        while  (i < NUM_FILAS && tablero[i][columna] == CASILLA_VACIA) {
            i++;
        }

        // hacemos jugada
        tablero[i-1][columna] = jugador;

        // Incrementamos contador
        contador++;

        // Pinta el tablero
        pintarTablero(tablero);
    }

    /**
     * Comprueba si la columna que se le pasa como parámetro es válida.
     *
     * @param tablero
     * @param columna
     * @return
     */
    private static boolean columnaValida(int[][] tablero, int columna) {
        return tablero[0][columna] == CASILLA_VACIA;
    }

    /**
     * Comprueba si el jugador ha ganado tras jugar en la columna indicada.
     *
     * @param tablero
     * @param columna
     * @param jugador
     * @return
     */
    private static boolean comprobarVictoria(int[][] tablero, int columna, int jugador) {
        return (comprobarVictoriaColumna(tablero, columna, jugador) || comprobarVictoriaFila(tablero, columna, jugador));
    }

    private static boolean comprobarVictoriaColumna(int[][] tablero, int columna, int jugador) {
        // Recorre la columna en la que se ha jugado para ver si hay victoria.
        int conectadas = 0;
        for (int i = 0; i < NUM_FILAS; i++) {
            if (tablero[i][columna] == jugador) {
                conectadas++;
            } else {
                conectadas = 0;
            }
            if (conectadas == CONECTA_X) return true;
        }

        return false;
    }

    private static boolean comprobarVictoriaFila(int[][] tablero, int columna, int jugador) {
        // Recorre la fila en la que se ha jugado para ver si hay victoria.
        int conectadas = 0;

        // Busco la fila en la que se ha insertado la ficha
        int filaJugada = 0;
        while (filaJugada < NUM_FILAS && tablero[filaJugada][columna] == CASILLA_VACIA) {
            filaJugada++;
        }

        for (int i = 0; i < NUM_COLUMNAS; i++) {
            if (tablero[filaJugada][i] == jugador) {
                conectadas++;
            } else {
                conectadas = 0;
            }
            if (conectadas == CONECTA_X) return true;
        }

        return false;
    }

}
