package Tema8Funciones;

import java.util.Scanner;

public class T08E10PiramideConFunciones {

    public static String linea(String caracter, int repeticiones) {
        // Valor de retorno
        String linea = "";

        for (; repeticiones > 0; repeticiones--) {
            linea += caracter;
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
        for (; altura > 0; altura--) {
            System.out.println(linea("*", altura));
        }

        // Cierra Scanner
        sc.close();
    }
}
