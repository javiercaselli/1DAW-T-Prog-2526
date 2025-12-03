package Tema7Arrays;

public class T07E23Tabla {
    public static void main(String[] args) {
        // Array bidimensional (tabla o tablero para los amigos)
        int[][] num = new int[3][6];

        // Asigna valores
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;

        num[1][0] = 75;
        num[1][4] = 0;

        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        // Pinta resultado
        String cabecera = "         Columna 0 Columna 1 Columna 2 Columna 3 Columna 4 Columna 5";
        System.out.printf("%s\n", cabecera); //Cabecera

        System.out.printf("%s%7d%10d%10d%10d%10d%10d\n", "Fila 0", num[0][0], num[0][1], num[0][2], num[0][3], num[0][4], num[0][5]);
        System.out.printf("%s%7d%10d%10d%10d%10d%10d\n", "Fila 1", num[1][0], num[1][1], num[1][2], num[1][3], num[1][4], num[1][5]);
        System.out.printf("%s%7d%10d%10d%10d%10d%10d\n", "Fila 2", num[2][0], num[2][1], num[2][2], num[2][3], num[2][4], num[2][5]);

    }
}
