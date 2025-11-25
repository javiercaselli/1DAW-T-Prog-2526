package Tema8Funciones;

import java.util.Scanner;

public class T08E14ValleSolido {

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
        System.out.print("Introduzca la altura del valle: ");
        int altura = sc.nextInt();

        // Pinta la pirámide (tantas lineas como altura tenga la pirámide)
        int huecos = (altura - 1) * 2;
        for (int i = 1; i <= altura; i++) {
            // Pinta lado izquierdo del valle
            System.out.print(linea("*", i));

            // Pinta huecos
            System.out.print(linea(" ", huecos));
            huecos = huecos - 2;

            // Pinta lado derecho del valle
            System.out.println(linea("*", i));
        }

        // Cierra Scanner
        sc.close();
    }
}
