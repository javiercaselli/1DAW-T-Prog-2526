package Examenes;

import java.util.Random;
import java.util.Scanner;

public class CazaDelTesoro {

    // Constantes del juego
    public static final int SIZE = 5;
    public static final int NUM_TESOROS = 3;

    // Códigos internos del tablero oculto
    public static final int VACIO = 0;
    public static final int TESORO = 1;

    // Marcas del tablero visible
    public static final char DESCONOCIDO = '~';
    public static final char AGUA = 'A';
    public static final char ENCONTRADO = 'T';

    public static void main(String[] args) {
        System.out.println("CAZA DEL TESORO");
        System.out.println("--------------");
        System.out.println();

        int[][] oculto = new int[SIZE][SIZE];      // dónde están los tesoros
        char[][] visible = new char[SIZE][SIZE];   // lo que ve el jugador

        inicializarVisible(visible);
        colocarTesoros(oculto);

        int puntosHumano = 0;
        int puntosOrdenador = 0;
        int tesorosEncontrados = 0;

        int turno = 0; // 0 humano, 1 ordenador

        pintarTablero(visible);

        while (tesorosEncontrados < NUM_TESOROS) {
            if (turno == 0) {
                System.out.println("\nTurno del HUMANO");
                boolean acierto = turnoHumano(oculto, visible);
                if (acierto) {
                    puntosHumano++;
                    tesorosEncontrados++;
                    System.out.println("¡Has encontrado un TESORO!");
                } else {
                    System.out.println("Agua...");
                }
                turno = 1;
            } else {
                System.out.println("\nTurno del ORDENADOR");
                boolean acierto = turnoOrdenador(oculto, visible);
                if (acierto) {
                    puntosOrdenador++;
                    tesorosEncontrados++;
                    System.out.println("El ordenador ha encontrado un TESORO.");
                } else {
                    System.out.println("El ordenador ha fallado (agua).");
                }
                turno = 0;
            }

            pintarTablero(visible);
            System.out.println("Puntos -> Humano: " + puntosHumano + " | Ordenador: " + puntosOrdenador);
        }

        System.out.println("\nFIN DE LA PARTIDA");
        System.out.println("Puntuación final -> Humano: " + puntosHumano + " | Ordenador: " + puntosOrdenador);

        if (puntosHumano > puntosOrdenador) {
            System.out.println("Enhorabuena, ¡GANA el humano!");
        } else if (puntosOrdenador > puntosHumano) {
            System.out.println("Lo siento, ¡GANA el ordenador!");
        } else {
            System.out.println("¡EMPATE!");
        }
    }

    // Inicializa el tablero visible a '~'
    public static void inicializarVisible(char[][] visible) {
        for (int f = 0; f < SIZE; f++) {
            for (int c = 0; c < SIZE; c++) {
                visible[f][c] = DESCONOCIDO;
            }
        }
    }

    // Coloca NUM_TESOROS tesoros sin repetir posiciones
    public static void colocarTesoros(int[][] oculto) {
        Random rand = new Random();
        int colocados = 0;

        while (colocados < NUM_TESOROS) {
            int f = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);

            if (oculto[f][c] == VACIO) {
                oculto[f][c] = TESORO;
                colocados++;
            }
        }
    }

    // Dibuja el tablero visible con índices
    public static void pintarTablero(char[][] visible) {
        System.out.println();
        for (int f = 0; f < SIZE; f++) {
            System.out.print(f + " | ");
            for (int c = 0; c < SIZE; c++) {
                System.out.print(visible[f][c] + "  ");
            }
            System.out.println();
        }

        System.out.print("    ");
        for (int c = 0; c < SIZE; c++) {
            System.out.print(c + "  ");
        }
        System.out.println("\n");
    }

    public static boolean turnoHumano(int[][] oculto, char[][] visible) {
        Scanner sc = new Scanner(System.in);

        int fila, col;
        do {
            System.out.print("Introduce fila (0.." + (SIZE - 1) + "): ");
            fila = sc.nextInt();
            System.out.print("Introduce columna (0.." + (SIZE - 1) + "): ");
            col = sc.nextInt();

            if (!jugadaValida(visible, fila, col)) {
                System.out.println("Jugada inválida (fuera de rango o ya intentada). Prueba otra.");
            }
        } while (!jugadaValida(visible, fila, col));

        return resolverJugada(oculto, visible, fila, col);
    }

    public static boolean turnoOrdenador(int[][] oculto, char[][] visible) {
        Random rand = new Random();
        int fila, col;

        do {
            fila = rand.nextInt(SIZE);
            col = rand.nextInt(SIZE);
        } while (!jugadaValida(visible, fila, col));

        System.out.println("El ordenador juega: (" + fila + ", " + col + ")");
        return resolverJugada(oculto, visible, fila, col);
    }

    // Comprueba rango y que no se haya jugado ya
    public static boolean jugadaValida(char[][] visible, int fila, int col) {
        if (fila < 0 || fila >= SIZE || col < 0 || col >= SIZE) return false;
        return visible[fila][col] == DESCONOCIDO;
    }

    // Aplica la jugada: marca AGUA o ENCONTRADO y devuelve si hubo acierto
    public static boolean resolverJugada(int[][] oculto, char[][] visible, int fila, int col) {
        if (oculto[fila][col] == TESORO) {
            visible[fila][col] = ENCONTRADO;
            return true;
        } else {
            visible[fila][col] = AGUA;
            return false;
        }
    }
}
