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
            switch (opcion.toUpperCase()) {
                case "A":
                    System.out.print("Introduzna un número binario: ");
                    System.out.println(T08E06Conversiones.binarioAOctal(sc.nextLine()));
                    break;
                case "B":
                    System.out.print("Introduzna un número binario: ");
                    System.out.println(T08E06Conversiones.binarioADecimal(sc.nextLine()));
                    break;
                case "C":
                    System.out.print("Introduzna un número binario: ");
                    System.out.println(T08E06Conversiones.binarioAHex(sc.nextLine()));
                    break;
                case "D":
                    System.out.print("Introduzna un número octal: ");
                    System.out.println(T08E06Conversiones.octalABinario(sc.nextLine()));
                    break;
                case "E":
                    System.out.print("Introduzna un número octal: ");
                    System.out.println(T08E06Conversiones.octalADecimal(sc.nextLine()));
                    break;
                case "F":
                    System.out.print("Introduzna un número octal: ");
                    System.out.println(T08E06Conversiones.octalAHex(sc.nextLine()));
                    break;
                case "G":
                    System.out.print("Introduzna un número decimal: ");
                    System.out.println(T08E06Conversiones.decimalABinario(sc.nextLine()));
                    break;
                case "H":
                    System.out.print("Introduzna un número decimal: ");
                    System.out.println(T08E06Conversiones.decimalAOctal(sc.nextLine()));
                    break;
                case "I":
                    System.out.print("Introduzna un número decimal: ");
                    System.out.println(T08E06Conversiones.decimalAHex(sc.nextLine()));
                    break;
                case "J":
                    System.out.print("Introduzna un número hexadecimal: ");
                    System.out.println(T08E06Conversiones.hexABinario(sc.nextLine()));
                    break;
                case "K":
                    System.out.print("Introduzna un número hexadecimal: ");
                    System.out.println(T08E06Conversiones.hexAOctal(sc.nextLine()));
                    break;
                case "L":
                    System.out.print("Introduzna un número hexadecimal: ");
                    System.out.println(T08E06Conversiones.hexADecimal(sc.nextLine()));
                    break;
                default:
                    break;
            }

        } while (!opcion.toUpperCase().equals("T"));

        // Cierra el scanner
        sc.close();
    }
}
