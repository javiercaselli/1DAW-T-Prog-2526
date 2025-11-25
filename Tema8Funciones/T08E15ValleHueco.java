package Tema8Funciones;

import java.util.Scanner;

public class T08E15ValleHueco {

    /**
     * Función que genera una línea de caracteres repetidos.
     * @param caracter Carácter a repetir
     * @param repeticiones Número de repeticiones
     * @return Línea generada
     */
    public static String linea(String caracter, int repeticiones) {
        // Valor de retorno
        String linea = "";

        for (; repeticiones > 0; repeticiones--) {
            linea += caracter;
        }

        return linea;
    }

    /**
     * Función que genera una línea hueca de caracteres.
     * @param caracter
     * @param repeticiones
     * @return Línea hueca generada
     */
    public static String lineaHueca(String caracter, int repeticiones) {
        // Valor de retorno
        String linea = "";

        for (int i = 0; i < repeticiones; i++) {
            if (i == 0 || i == repeticiones - 1) {
                linea += caracter;
            } else {
                linea += " ";
            }
        }

        return linea;
    }

    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Pide altura de la pirámide
        System.out.print("Introduzca la altura del valle: ");
        int altura = sc.nextInt();

        // Pinta la pirámide (tantas lineas como altura tenga la pirámide)
        int huecos = (altura - 1) * 2;
        for (int i = 1; i <= altura; i++) {
            // Pinta lado izquierdo del valle
            if (i == altura || i == 1) {
                 System.out.print(linea("*", i));
            } else {
                 System.out.print(lineaHueca("*", i));
            }

            // Pinta huecos
            System.out.print(linea(" ", huecos));
            huecos = huecos - 2;

            // Pinta lado derecho del valle
            // Pinta lado izquierdo del valle
            if (i == altura || i == 1) {
                 System.out.println(linea("*", i));
            } else {
                 System.out.println(lineaHueca("*", i));
            }
        }

        // Cierra Scanner
        sc.close();
    }
}
