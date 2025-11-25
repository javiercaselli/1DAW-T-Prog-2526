package Tema8Funciones;

import java.util.Scanner;

public class T08E11PiramideHuecaConFunciones {

    public static String linea(String caracter, int repeticiones) {
        // Valor de retorno
        String linea = "";

        for (; repeticiones > 0; repeticiones--) {
            linea += caracter;
        }

        return linea;
    }

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
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();

        // Pinta la pirámide (tantas lineas como altura tenga la pirámide)
        for (int i = altura; i > 0; i--) {
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
