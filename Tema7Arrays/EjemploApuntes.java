package Tema7Arrays;

import java.util.Scanner;

public class EjemploApuntes {
    public static void main(String[] args) {
        int tablero[][] = {
            {8, -12, 33},
            {14, 1, -24},
            {100, 51, 69}
        };


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca fila: ");
        int fila = sc.nextInt();
        System.out.print("Introduzca columna: ");
        int col = sc.nextInt();
        System.out.println();
        System.out.println("El valor buscado es: " + tablero[fila-1][col-1]);

        sc.close();
        
    }
}
