package Tema8Funciones;

import java.util.Scanner;
import Tema8Funciones.T08E06Conversiones.*;

public interface T08E06MainConversiones {

    public static void main(String[] args) {
        String opcion = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("A) Binario -> Octal\r\n" + //
                                "B) Binario -> Decimal\r\n" + //
                                "C) Binario -> Hexadecimal\r\n" + //
                                "D) Octal -> Binario\r\n" + //
                                "E) Octal -> Decimal\r\n" + //
                                "F) Octal -> Hexadecimal\r\n" + //
                                "G) Decimal -> Binario\r\n" + //
                                "H) Decimal -> Octal\r\n" + //
                                "I) Decimal -> Hexadecimal\r\n" + //
                                "J) Hexadecimal -> Binario\r\n" + //
                                "K) Hexadecimal -> Octal\r\n" + //
                                "L) Hexadecimal -> Decimal\r\n" + //
                                "T) Terminar\r\n" + //
                                "");

            System.out.print("Elija una opción: ");
            opcion = sc.nextLine();
            String entrada = "";
            switch (opcion) {
                case "A":
                    System.out.print("Introduzna un número binario: ");
                    System.out.println(T08E06Conversiones.binarioADecimal(sc.nextLine()));
                    break;
                case "E":
                    System.out.print("Introduzna un número octal: ");
                    System.out.println(T08E06Conversiones.octalADecimal(sc.nextLine()));
                    break;
                case "L":
                    System.out.print("Introduzna un número hexadecimal: ");
                    System.out.println(T08E06Conversiones.hexADecimal(sc.nextLine()));
                    break;
                default:
                    break;
            }

        } while (!opcion.equals("T"));

        // Cierra el scanner
        sc.close();
    }
}
